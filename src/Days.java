enum Days { MONDAY , TUESDAY , WEDNESDAY , THURSDAY , FRIDAY , SATURDAY, SUNDAY}

class Main{

    public static void main(String[] args) {
        Days myDays = Days.FRIDAY;
        System.out.println(myDays);

        switch (myDays){
            case SUNDAY:
                System.out.println("Sundays are beautiful.");
                break;

            case MONDAY:
                System.out.println("Mondays are for works.");
                break;

            case TUESDAY:
                System.out.println("Tuesdays are for work.");
                break;

            case WEDNESDAY:
                System.out.println("Wednesdays are for flexing.");
                break;

            case THURSDAY:
                System.out.println("Thursdays are for visitations");
                break;

            case FRIDAY:
                System.out.println("Thank Gos it's Friday!");
                break;

            case SATURDAY:
                System.out.println("Saturdays are for partying.");
                break;


        }
        }
    }









