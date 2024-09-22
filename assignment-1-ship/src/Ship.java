public class Ship {

    /*
     * ToDo: x & y axis methods. printSpeed in km/h.
     * all eight directions using degrees and radian.
     * showLocation prints x, y, direction with simple-
     * text showing origin place and the ship place.
     * speedboat inherited class.
     * Add auto cardinal direction assign.
     */
    private String name; 
    private double x, y, speed, direction, distance;
    private String cardinalDirection;

    Ship() {    
    }

    Ship(String name) {
        this.name = name;
    }

    Ship(String name, 
         double x, double y) {
        this.name       = name;
        this.x          = x;
        this.y          = y;
    }

    Ship(String name, 
         double x, double y, 
         double speed) {
        this.name       = name;
        this.x          = x;
        this.y          = y;
        this.speed      = speed;
    }

    Ship(String name, 
         double x, double y, 
         double speed, double direction) {
        this.name         = name;
        this.x            = x;
        this.y            = y;
        this.direction    = direction;
        this.cardinalDirection = getCardinalDirection();
    }

    void setName(String name) {
        this.name = name;
    }

    void setX(double x) {
        this.x = x;
    }

    void setY(double y) {
        this.y = y;
    }

    void setDirection(double direction) {
        this.direction = direction;
    }

    void setSpeed(double speed) {
        this.speed = speed;
    }

    String getName() {
        return name;
    }

    double getX() {
        return x;
    }

    double getY() {
        return y;
    }
 
    double getSpeed() {
        return speed;
    }

    double getDirection() {
        return direction;
    }

    String getCardinalDirection() {
        if (checkDirectionNorthToEast() != "Out of range") {
            return cardinalDirection;
        }
        else if (checkDirectionEastToSouth() != "Out of range") {
            return cardinalDirection;
        }
        else if (checkDirectionSouthToWest() != "Out of range") {
            return cardinalDirection;
        }
        else if (checkDirectionWestToNorth() != "Out of range") {
            return cardinalDirection;
        }

        return cardinalDirection;
    }

    void displayCurrentPosition() {
        if (speed == 0) {
            System.out.printf("%s is in (%f, %f)\n",
                                getName(), getX(), getY());
        }
        else {
            x += getSpeed() * Math.cos(getDirection() / 180.0);
            y += getSpeed() * Math.sin(getDirection() / 180.0);
            System.out.printf("%s is now in (%f, %f)\n", 
                                getName(), getX(), getY());
        }

    }

    double degreesToRadians() {
        return Math.toRadians(direction);
    }

    void displayRadians() {
         // Express in terms of pi
        double multipleOfPi = degreesToRadians() / Math.PI;  

        // Output the result in the form nπ
        if (multipleOfPi == (int) multipleOfPi) {
            System.out.printf("%f in radians: %d * pi\n", 
                                direction,(int) multipleOfPi);
        } else {
            System.out.printf("%f in radians: %.2f * pi\n", 
                                direction, multipleOfPi);
        }
    }

    String checkDirectionNorthToEast() {
        if  (
             (direction  >  337.5     && 
             direction  <=  380)       ||
             (direction >=  0.0f      && 
             direction  <=  90.0f)
             ) {
            if (direction >= 22.5f && direction <= 67.5) {
                cardinalDirection = "North-east";
            }
            else if (
                     (direction  >  337.5f   && 
                     direction  <= 380)      &&
                     (direction >= 0        && 
                     direction  <  22.5)
                     ) {
                cardinalDirection = "North";
            }
            else if (direction > 67.5f){
                cardinalDirection = "East";
            }
        }
        else {
            cardinalDirection = "Out of range";
        }

        return cardinalDirection;
    }

    String checkDirectionEastToSouth() {
        if (
            (direction > 67.5 && direction < 202.5)
            ) {
                if (direction > 67.5 && direction < 112.5) {
                    cardinalDirection = "East";
                }
                else if (direction >= 112.5 && direction <= 157.5) {
                    cardinalDirection ="South-east";
                }
                else if (direction > 157.5 && direction < 202.5) {
                    cardinalDirection ="South";
                }
            }
        else {
            cardinalDirection = "Out of range";
        }
        
        return cardinalDirection;
    }
   
    String checkDirectionSouthToWest() {
        if (
            (direction > 157.5  && direction < 292.5)
            ) {
            if (direction > 157.5 && direction < 202.5) {
                cardinalDirection = "South";
            }
            else if (direction >= 202.5 && direction <= 247.5) {
                cardinalDirection = "South-west";
            }
            else if (direction > 247.5 && direction < 292.5) {
                cardinalDirection = "West";
            }

        }
        else {
            cardinalDirection = "Out of range";
        }
        return cardinalDirection;
    }
   
    String checkDirectionWestToNorth() {
        if (
            (direction > 247.5 && direction <= 360)     ||
            (direction >= 0 && direction < 22.5)
            )
            {
            if (direction > 247.5 && direction < 292.5) {
                cardinalDirection = "West";
            }
            else if (direction >= 292.5 && direction <= 337.5) {
                cardinalDirection = "North-west";
            }
            else if ((direction > 337.5 && direction <= 360) || 
                     (direction >= 0 && direction < 22.5)) {
                cardinalDirection = "North";
            }
        }
        else {
            cardinalDirection = "Out of range";
        }
        return cardinalDirection;
    }

    String displayCardinalDirection() {
        String cardinalDirection = null;

        /*
         * Table of directions in degrees (clockwise) for refrence
         * North            337.5   <  x <      380 
         *                            &&
         *                  0       <  x <      22.5
         * 
         * North-east       22.5    <= x <=     67.5
         * East             67.5    <  x <      112.5
         * South-east       112.5   <= x <=     157.5
         * South            157.5   <  x <      202.5
         * South-west       202.5   <= x <=     247.5
         * West             247.5   <  x <      292.5
         * North-west       292.5   <= x <=     337.5
         */

        return cardinalDirection;
    }

    void displaySpeed() {
        System.out.printf("\n%s speed is %f km/h\n", 
                          getName(), getSpeed());
    }

    void displayLocationAndDirection() {
        System.out.printf("%s coordinates are (%f, %f)\n",
                            getName(), getX(), getY()); 
        System.out.printf("Direction is %f %s\n",
                            getDirection(), getCardinalDirection());
        
}
}
