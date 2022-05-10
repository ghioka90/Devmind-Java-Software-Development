package PregatireExam;
import java.util.*;
import java.lang.reflect.Modifier;

//public abstract class TheLordOfJava {

    interface ICreature {
        String getNickname();
        void setNickname(String nickname);
        void updateScore(long amount) throws NumberFormatException;
        void powerUp(double stamina, double speed, int agility);
    }

    interface IBurn {
        double getFlamesPower();
        int getFlyingSpeed();
    }

    interface IBite {
        double getBitePower();

    }

    class Parameters {
        // place your code here. you can also modify the class signature, if necessary.
        public String OS;
        public String gamePATH;
        public String credentials;
        public int noLives;

        public Parameters(String OS, String gamePATH, String credentials, int noLives){
            this.OS = OS;
            this.gamePATH = gamePATH;
            this.credentials = credentials;
            this.noLives = noLives;
        }

        public String toString(){
            return "OS: " + this.OS
                    + "\nGame Path: " + this.gamePATH
                    + "\nCredentials: " + this.credentials
                    + "\nNo. lives remaining: " + this.noLives+ "\n";
        }
    }

    class Abilities implements Comparable<Abilities> {
        // place your code here. you can also modify the class signature, if necessary.
        Double stamina;
        Double speed;
        Integer agility;

        public Abilities(double stamina, double speed, int agility) {
            this.stamina = stamina;
            this.speed = speed;
            this.agility = agility;
        }

        public void update(double stamina, double speed, int agility) {
            this.stamina += stamina;
            this.speed += speed;
            this.agility += agility;
        }

        @Override
        public int compareTo(Abilities other) {
            if (this.stamina < other.stamina) {
                return -1;
            }
            if (this.stamina > other.stamina) {
                return 1;
            }
            if (this.speed < other.speed) {
                return -1;
            }
            if (this.speed > other.speed) {
                return 1;
            }
            if (this.agility < other.agility) {
                return -1;
            }
            if (this.agility > other.agility) {
                return 1;
            }
            return 0;
        }

        public int powerDifferenceApprox(Abilities other) {
            return (int) Math.abs(this.stamina - other.stamina);
        }

        @Override
        public String toString() {
            return "Player has a power of: " + stamina + ", the speed: " + speed + " and the agility: " + agility;
        }
    }
    abstract class Creature implements ICreature, Comparable<Creature> {
        // place your code here. you can also modify the class signature, if necessary.
        private Abilities abilities;
        private String nickname;
        private long score;

        public Creature(double stamina, double speed, int agility,
                        String nickname, long score) {
            this.abilities = new Abilities(stamina, speed, agility);
            this.nickname = nickname;
            this.score = score;
        }

        @Override
        public int compareTo(Creature o) {
            return this.abilities.compareTo(o.abilities);
        }

        @Override
        public String getNickname() {
            return this.nickname;
        }

        @Override
        public void setNickname(String nickname){
        this.nickname = nickname;
        }

        public void updateScore(long amount) throws NumberFormatException{
            if (amount <= 0){
                throw new NumberFormatException("Expecting positive bonus value, got:" + amount);
            }
            this.score += amount;
        }

        public void powerUp(double stamina, double speed, int agility){
            abilities.update(stamina, speed, agility);
        }

        public String toString(){
            return "Nickname: " + this.nickname +
                    "\nScore: " + this.score +
                    "\nAbilities: " + this.abilities;
        }
    }

    class Dragon extends Creature implements IBurn {
        // place your code here. you can also modify the class signature, if necessary.
        Creature dragon;
        double flamesPower;
        int flySpeed;

        public Dragon(double stamina, double speed, int agility, String nickname, long score, double flamesPower, int flySpeed){
          super(stamina, speed, agility, nickname, score);
          this.flamesPower = flamesPower;
          this.flySpeed = flySpeed;
        }

        public double getFlamesPower(){
            return this.flamesPower;
        }


        public int getFlyingSpeed(){
            return this.flySpeed;
        }

        @Override
        public void powerUp(double newStamina, double newSpeed, int newAgility){
            super.powerUp(newStamina * 2, newSpeed / 2, newAgility * 3);
        }

        @Override
        public String toString(){
            return super.toString() + "\nFlames power: " + this.flamesPower +
                    "\nFly speed: " + this.flySpeed;
        }
    }

     class Warg extends Creature implements IBite{
        // place your code here. you can also modify the class signature, if necessary.
        Creature warg;
        double bitePower;

        public Warg(double stamina, double speed, int agility, String nickname, long score, double bitePower){
            super(stamina, speed, agility, nickname, score);
            this.bitePower = bitePower;

        }

        public double getBitePower(){
            return this.bitePower;
        }


        @Override
        public void powerUp(double newStamina, double newSpeed, int newAgility){
            super.powerUp(newStamina / 2, newSpeed * 4, newAgility);
        }

        @Override
        public String toString(){
            return super.toString() + "\nBite Power: " + this.bitePower;
        }
    }

     class Mumakil extends Creature {
        // place your code here. you can also modify the class signature, if necessary.
        Creature mumakil;


        public Mumakil(double stamina, double speed, int agility, String nickname, long score){
            super(stamina, speed, agility, nickname, score);
        }

        @Override
        public void powerUp(double newStamina, double newSpeed, int newAgility){
            super.powerUp(newStamina * 0.75, newSpeed + 10, newAgility);
        }

        @Override
        public String toString(){
            return super.toString() + "\nA creature of type Mumakil.";
        }
    }

    class Cohort<C extends Creature> {
        // place your code here. you can also modify the class signature, if necessary.
        private Map<String, C> citizens = new HashMap<>();

        public ArrayList<C> getAllCitizensToFight() {
            ArrayList<C> allAligned = new ArrayList<>(citizens.values());
            Collections.sort(allAligned);
            return allAligned;
        }

        public void addNewCitizen(String address, C creature) {
            this.citizens.put(address, creature);
        }

        public C getCitizenAt(String address) {
            return citizens.get(address);
        }

        public int size() {
            return this.citizens.size();
        }

        public boolean isEmpty() {
            return citizens.size() == 0;
        }

        @Override
        public String toString() {
            ArrayList<C> citizensAligned = getAllCitizensToFight();
            String ret = "";
            for (C creature : citizensAligned) {
                ret += creature + "\n";
            }
            return ret;
        }
    }

    class LordOfJava {
        // place your code here. you can also modify the class signature, if necessary.
        private Parameters parameters;
        private Cohort<Dragon> dragons = new Cohort<>();
        private Cohort<Warg> wargs = new Cohort<>();
        private Cohort<Mumakil> mumakils = new Cohort<>();

        public LordOfJava(String OS, String gamePATH, String credentials, int noLives){
        parameters = new Parameters(OS, gamePATH, credentials, noLives);
        }

        public void addCreature(Creature creature, String address){
            if (creature instanceof Dragon){
                dragons.addNewCitizen(address, (Dragon)creature);
            }else if (creature instanceof Warg){
                wargs.addNewCitizen(address, (Warg)creature);
            }else if (creature instanceof Mumakil){
                mumakils.addNewCitizen(address, (Mumakil)creature);
            }else{
                throw new IllegalArgumentException("Creature type unknown: " + creature.getClass().getName());
            }
        }

        public int battleDragonsWargs(){
            int res = 0;
            if (wargs.size() > dragons.size()){
                return -1;
            }

            ArrayList<Dragon> dragonsToFight = dragons.getAllCitizensToFight();
            ArrayList<Warg> wargsToFight = wargs.getAllCitizensToFight();

            if (wargs.size() < dragons.size()){
                return 1;
            }
            for(int i = 0; i < wargs.size(); i++ ){
                int duelRes = wargsToFight.get(i).compareTo(dragonsToFight.get(i));
                if (duelRes > 0){
                    res += 1;
                }else if (duelRes < 0){
                    res += -1;
                }else{
                    res += 0;
                }
            }
            return res;
        }

        @Override
        public String toString() {
            return "" + parameters + "\n" + dragons + "\n" + wargs + "\n" + mumakils;
        }


    }



     class Solution {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int testNumber = sc.nextInt();
            sc.close();

            switch (testNumber) {
                case 0:
                    System.out.println("Ok! Let's start!");
                    break;
                case 1:
                    Parameters parameters = new Parameters("Mac OS", "./username", "strongPassword2021", 100);
                    System.out.println(parameters);
                case 2:
                    Abilities ability1 = new Abilities(25.0, 100.0, 14);
                    Abilities ability2 = new Abilities(25.0, 98.0, 14);
                    Abilities ability3 = new Abilities(25.0, 98.0, 27);

                    System.out.println(ability1.compareTo(ability2));
                    System.out.println(ability2.compareTo(ability3));

                    System.out.println(ability1.powerDifferenceApprox(ability2));
                    ability1.update(30, 17, -10);
                    System.out.println(ability1.powerDifferenceApprox(ability2));
                    break;
                case 3:
                    Class<Creature> creature = Creature.class;
                    System.out.println(Modifier.isAbstract(creature.getModifiers()));
                    System.out.println(ICreature.class.isAssignableFrom(creature));
                    System.out.println(Comparable.class.isAssignableFrom(creature));
                    break;
                case 4:
                    Class<Dragon> dragonClass = Dragon.class;
                    Dragon dragon1 = new Dragon(25, 100, 15, "master_dragon", 80, 20, 40);
                    System.out.println(IBurn.class.isAssignableFrom(dragonClass));
                    dragon1.powerUp(10, 20, 12);
                    System.out.println(dragon1);
                    break;
                case 5:
                    Class<Warg> wargClass = Warg.class;
                    Warg warg1 = new Warg(25, 100, 15, "master_warg", 85, 20);
                    System.out.println(IBite.class.isAssignableFrom(wargClass));
                    warg1.powerUp(10, 20, 12);
                    System.out.println(warg1);
                    break;
                case 6:
                    Class<Mumakil> mumakilClass = Mumakil.class;
                    Mumakil mumakil1 = new Mumakil(25, 100, 15, "master_muma", 60);
                    mumakil1.powerUp(10, 20, 12);
                    System.out.println(mumakil1);
                    break;
                case 7:
                    Cohort<Dragon> dragonCohort = new Cohort<>();
                    Dragon dragon71 = new Dragon(25, 100, 15, "master_dragon1", 80, 20, 40);
                    Dragon dragon72 = new Dragon(35, 76, 5, "master_dragon2", 100, 20, 40);

                    System.out.println(dragonCohort.isEmpty());
                    dragonCohort.addNewCitizen("25,25", dragon71);
                    dragonCohort.addNewCitizen("10,12", dragon72);
                    System.out.println(dragonCohort.isEmpty());

                    System.out.println(dragonCohort.getCitizenAt("25,25"));
                    System.out.println(dragonCohort.getAllCitizensToFight());
                    System.out.println(dragonCohort.getCitizenAt("test"));
                    break;
                case 8:
                    LordOfJava lordOfJava = new LordOfJava("Mac OS", "./username", "strongPassword2021", 3);

                    Dragon dragon81 = new Dragon(25, 100, 15, "master_dragon1", 80, 20, 40);
                    Dragon dragon82 = new Dragon(35, 76, 5, "master_dragon2", 100, 20, 40);

                    Warg warg81 = new Warg(25, 100, 15, "master_warg1", 85, 20);
                    Warg warg82 = new Warg(80, 56, 23, "master_warg1", 85, 20);

                    Mumakil mumakil81 = new Mumakil(25, 100, 15, "master_muma", 60);

                    lordOfJava.addCreature(dragon81, "25,25");
                    lordOfJava.addCreature(dragon82, "14,24");
                    lordOfJava.addCreature(warg81, "12,27");
                    lordOfJava.addCreature(warg82, "05,15");
                    lordOfJava.addCreature(mumakil81, "01,01");

                    System.out.println(lordOfJava.battleDragonsWargs());
                    System.out.println(lordOfJava);

            }
        }
    }

