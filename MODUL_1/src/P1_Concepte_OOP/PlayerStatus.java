package P1_Concepte_OOP;

import java.util.Scanner;

public class PlayerStatus {
    Scanner sc = new Scanner(System.in);
    private String nickname;
    int score;
    int lives;
    int health;
    String weapon;
    double positionX;
    double positionY;
    boolean perfectNo = false;
    boolean primeNo = false;
    String gameName;
    double probability = 0;

    /*
    1.   3 metode de initializare, cu diverse seturi de parametri:
     */
    public void initPlayer(String nickname) {
        this.nickname = nickname;
    }

    public void initPlayer(String nickname, int lives) {
        this.nickname = nickname;
        this.lives = lives;
    }

    public void initPlayer(String nickname, int lives, int score) {
        this.nickname = nickname;
        this.lives = lives;
        this.score = score;
    }

    /*
    2.   findArtifact(int artifactCode): metoda va actualiza starea jucatorului in functie de artifactul gasit
     */
    public boolean isPerfect(int artifactCode) {
        int i, Sum = 0;
        for (i = 1; i < artifactCode; i++) {
            if (artifactCode % i == 0) {
                Sum = Sum + i;
            }
        }
        if (Sum == artifactCode) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isPrime(int artifactCode) {
        int i, count = 0;
        for (i = 2; i <= artifactCode / 2; i++) {
            if (artifactCode % i == 0) {
                count++;
                break;
            }
        }
        if (count == 0 && artifactCode != 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isIven(int artifactCode) {
        if (artifactCode / 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean sumDigitsDiv3(int artifactCode) {
        int lastDigit, sum = 0;
        while (artifactCode > 0) {
            lastDigit = artifactCode % 10;
            sum += lastDigit;
            artifactCode /= 10;
        }
        if (sum % 3 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void findArtifact(int artifactCode) {
        if (isPerfect(artifactCode) == true) {
            score += 5000;
            lives += 1;
            health = 100;
        } else {
            if (isPrime(artifactCode) == true) {
                score += 1000;
                lives += 2;
                health += 25;
                if (health > 100)
                    health = 100;
            } else {
                if (isIven(artifactCode) == true && sumDigitsDiv3(artifactCode) == true) {
                    score -= 3000;
                    health -= 25;
                    if (health <= 0) {
                        lives--;
                    }
                } else {
                    score += artifactCode;
                }
            }
        }
        if (health <= 0) {
            lives--;
            health = 100;
        }
        if (lives == 0) {
            System.out.println("GAME OVER!");
        }
    }

    /*
    3.   setWeaponInHand(String weaponInHand): actiunea va schimba arma folosita de jucator in joc
     */
    public boolean setWeaponInHand(String weapon) {
        if (weapon.equals("knife") && score >= 1000) {
            this.weapon = weapon;
            this.score -= 1000;
            return true;
        } else {
            if (weapon.equals("sniper") && score >= 10000) {
                this.weapon = weapon;
                this.score -= 10000;
                return true;
            } else {
                if (weapon.equals("kalashnikov") && score >= 100000) {
                    this.weapon = weapon;
                    this.score -= 10000;
                    return true;
                } else {
                    return false;
                }
            }
        }
    }

    /*
    4.   getWeaponInHand(): returneaza arma curenta a jucatorului
     */
    public String getWeaponInHand() {
        return weapon;
    }

    /*
    5.   transforma campurile positionX si positionY in proprietati ale obiectelor clasei PlayerStatus
     */
    public void setPositionX(double positionX) {
        this.positionX = positionX;
    }

    public void setPositionY(double positionY) {
        this.positionY = positionY;
    }

    public double getPositionX() {
        return positionX;
    }

    public double getPositionY() {
        return positionY;
    }


    /*
    distanta dintre 2 jucatori
     */
    public double distanceBetweenPlayers(PlayerStatus opp) {
        return Math.sqrt(((this.positionX - opp.positionX) * (this.positionX - opp.positionX)) +
                ((this.positionY - opp.positionY) * (this.positionY - opp.positionY)));
    }

    /*
    6.   implementeaza metodele necesare pentru ca atributul gameName sa devina o proprietate
     */
    protected void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getGameName() {
        return gameName;
    }

    /*
    7.   movePlayerTo(double positionX, double positionY) intuitiv,
    metoda actualizeaza pozitia jucatorului, prin actualizarea pozitiei acestuia
     */
    public void movePlayerTo(double positionX, double positionY) {
        setPositionX(positionX);
        setPositionY(positionY);
    }

    /*
    duelul dintre 2 jucatori
     */
    public void duel(PlayerStatus opp) {
        switch (getWeaponInHand()) {
            case "kife":
                opp.health -= 25;
            case "sniper":
                opp.health -= 100;
            case "kalashnikov":
                opp.health -= 50;
        }
        if (opp.health <= 0) {
            opp.lives--;
            opp.setHealth(100);
        }
        if (opp.lives == 0) {
            opp.setHealth(0);
            System.out.println("GAME OVER!");
        }
    }

//    public double probability (int health, int score){
//        int probability;
//        probability = (3 * health + score / 1000) / 4;
//        return probability;
//    }

    public boolean shoultAttackOpponent(PlayerStatus opp) {
        probability = (3 * health + score / 1000) / 4;
        if (this.weapon.equals(opp.getWeaponInHand())) {
            if (this.probability > opp.probability) {
                System.out.println(nickname + " wins!");
                return true;
            }
            if (this.probability < opp.probability) {
                System.out.println(opp + " wins!");
                return false;
            }
        } else {
            if (distanceBetweenPlayers(opp) > 1000) {
                if (this.weapon.equals("sniper") && opp.weapon.equals("kife")) {
                    System.out.println(nickname + " wins!");
                    return true;
                }
                if (opp.equals("sniper") && this.weapon.equals("kife")) {
                    System.out.println(opp + " wins!");
                    return false;
                }

                if (this.weapon.equals("kalashnikov") && opp.weapon.equals("kife")) {
                    System.out.println(nickname + " wins!");
                    return true;
                }
                if (opp.equals("kalashnikov") && this.weapon.equals("kife")) {
                    System.out.println(opp + " wins!");
                    return false;
                }

                if (this.weapon.equals("sniper") && opp.weapon.equals("kalashnikov")) {
                    System.out.println(nickname + " wins!");
                    return true;
                }
                if (opp.equals("sniper") && this.weapon.equals("kalashnikov")) {
                    System.out.println(opp + " wins!");
                    return false;
                }
            }

            if (distanceBetweenPlayers(opp) <= 1000) {
                if (this.weapon.equals("sniper") && opp.weapon.equals("kife")) {
                    System.out.println(nickname + " wins!");
                    return true;
                }
                if (opp.equals("sniper") && this.weapon.equals("kife")) {
                    System.out.println(opp + " wins!");
                    return false;
                }

                if (this.weapon.equals("kalashnikov") && opp.weapon.equals("kife")) {
                    System.out.println(nickname + " wins!");
                    return true;
                }
                if (opp.equals("kalashnikov") && this.weapon.equals("kife")) {
                    System.out.println(opp + " wins!");
                    return false;
                }

                if (this.weapon.equals("sniper") && opp.weapon.equals("kalashnikov")) {
                    System.out.println(opp + " wins!");
                    return false;
                }
                if (opp.equals("sniper") && this.weapon.equals("kalashnikov")) {
                    System.out.println(nickname + " wins!");
                    return true;
                }
            }
        }
        return false;
    }



    public int getScore() {
        return score;
    }
    public void setLives(int lives) {
        this.lives = lives;
    }
    public int getLives() {
        return lives;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public int getHealth() {
        return health;
    }




    public static void main(String[] args) {
    }
}
