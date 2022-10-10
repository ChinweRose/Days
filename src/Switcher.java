public class Switcher {

    public static void main(String[] args) {

        String name = ("Enter a command line");


        switch("stop"){
            case "start":
                System.out.print("You are on track!");
                break;


            case "stop" :
                System.out.println("You are on track");
                break;


            case "change position" :
                System.out.println("You are on track.");
                break;


            default:
                System.out.println("Not on track, start all over!");
                break;
        }
        }
        }

