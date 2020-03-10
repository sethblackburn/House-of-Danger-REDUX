// 17 Feb 2020: project started
// 28 Feb 2020: Version 1.0 completed and uploaded to https://github.com/sethblackburn
// 09 Mar 2020: Version 1.1 Update - reformatted the main loop to use a switch instead of a long string of if-statements;
//              embedded loop and switch in its own method at the end of the Main class

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        introduction();
        mainSwitch();
        conclusion();
    }

    private static void introduction() {
        System.out.println("\n Welcome to House of Danger REDUX - Version 1.1!\n" +
                "\n" +
                " LEGAL DISCLAIMER:\n" +
                "\n" +
                " This interactive fiction experience is a scholarship exercise fair use adaptation of Choose Your Own " +
                "Adventure: House of Danger, a cooperative adventure card game designed by Prospero Hall and published " +
                "by Z-Man Games, Inc., which was adapted from Choose Your Own Adventure #6: House of Danger by R.A. " +
                "Montgomery.  All relevant copyrights are the exclusive property of their respective copyright holders." +
                "  The maker of House of Danger REDUX claims no ownership to any contained copyrighted content; the " +
                "inclusion of copyrighted content within this program is included under fair use within the bounds of " +
                "United States copyright law.\n" +
                "\n" +
                " TERMS OF USE:\n" +
                "\n" +
                " This work is a programming exercise and demonstration for educational and scholarship purposes only.  " +
                "Open-source permission from the creator is granted, but any and all alternations to this code must be " +
                "done in such a way that the final version of the code remains within the bounds of fair use with " +
                "regards to any copyrighted material.  Use of this code for any commercial purposes without written and " +
                "notarized permission of all relevant copyright holders, as well as the creator of this code (Seth Blackburn) " +
                "is not allowed.  The use of this code in any manner or any purpose not specified by the creator is " +
                "prohibited.  \n");
    }

    private static int card100() {
        Scanner input = new Scanner(System.in);
        System.out.println("     House of Danger\n" +
                "\n" +
                "     Chapter 1: The Grounds\n" +
                "\n" +
                "     It's a Tuesday morning in late June, and you wake up in a cold sweat. The nightmares came " +
                "again last night.  Even though you are an aspiring detective and psychic investigator, you haven't" +
                "been able to make sense of the haunting dreams you've had these last few weeks.  In your dreams you " +
                "keep seeing the same spooky house.  You're still shivering under the covers when you hear the phone " +
                "ring downstairs in your basement, where you have your combination office and research laboratory.  " +
                "You dash down to the lab to answer it. \n" +
                "     \"I need . . . I need . . . .\" a weak voice says when you pick up the receiver. \"I need your " +
                "hel-l-l-lp.\"  You hear a loud click, and the phone goes dead. \n" +
                "     But you were prepared: while the caller was talking, you activated your high-speed telephone tracing " +
                "device. It instantly displays the caller's number: 555-7259. \n" +
                "     You call back the number right away, but there's no answer.  After consulting the tall stack of " +
                "reverse phone books behind your desk, you are disappointed to learn the number is unlisted. \n" +
                "     You sense that the phone call is somehow related to your nightmares. \n" +
                "     Later, while at the Hedge Brook Police Station to return a night scope you borrowed for a recent " +
                "stakeout, you describe the mysterious phone call and your recurring dreams to your friend, " +
                "Sergeant Morrison. \n" +
                "     \"That call does sound strange,\" he says. \"We'll look into it.\" \n" +
                "     \"And about that house in your dreams,\" a voice says from the hallway. \"I wonder if you're " +
                "dreaming about the Marsden house out on Hedge Brook Road.\" Detective Murphy sticks his " +
                "mustached face into the room. \n" +
                "     \"Modern house, ornate gate . . . That sounds like the Marsden place, all right,\" says Sargeant " +
                "Morrison. \"Strange things are reported to happen out there.\" \n" +
                "     Detective Murphy takes a puff on his pipe. \"That place is haunted,\" he says. \"I know it " +
                "sounds unprofessional, but I've had a file on the Marsden house for years, and I'm sure of it.\"  " +
                "He waves a folder in front of your eyes, and a phone number written on the front jumps out at you.\n" +
                "     It matches the one from your mysterious phone call.  \n" +
                "     So the call is related to your nightmares--your psychic sense was right!  \n" +
                "     Back at home, you grab a bottle of water and your trusty pocketknife, preparing for a new " +
                "investigation.  Half an hour later, you stand before the Marsden residence, which appears " +
                "exactly as it did in your nightmares.  The house's futuristic look is a strange contrast to the " +
                "antiquated appearance of the stone wall and the wrought iron gate, which is locked shut and " +
                "wrapped in steel chains. \n" +
                "     Even though the air is balmy, a chill travels down your spine.  The gathering clouds on the " +
                "horizon hint at a brewing summer thunderstorm. \n");
        while (true) {
            System.out.println(" If you search the wall for a way in, type \"search\" and press 'Enter'.\n" +
                    " If you climb the gate, type \"climb\" and press 'Enter'.");

            String choice = input.next();

            if (choice.equalsIgnoreCase("search")) {
                return 1300;
            } else if (choice.equalsIgnoreCase("climb")) {
                return 700;
            } else {
                System.out.println("Command not recognized. Let's try again. \n");
            }
        }
    }

    private static int card200() {
        Scanner input = new Scanner(System.in);
        System.out.println("     In one heroic move, you jump into the opening of the roof access door and land on your " +
                "feet inside the greenhouse, ninja-like.  You take a deep breath, ninja-like.  You collect yourself, " +
                "ninja-like.  You assess the situation . . . like a ninja. \n" +
                "     The botanical specimens in this greenhouse are unlike anything you've ever seen.  Glossy pink bulbs " +
                "seven feet across sit atop yellow vines that spread horizontally for twenty feet.  One plant with " +
                "sharp spikes is actually see-through. \n" +
                "     Suddenly, you hear a rustling sound. You look to the corner of the room and see a dark-green cluster " +
                "of vertical vines twitching and shaking. 'I might not be alone,' you think. \n" +
                "     Through the wall of the greenhouse, you spot a commotion of some kind of top of a gazebo just " +
                "beyond the trees about forty feet away.  You need to think fast!\n");
        while (true) {
            System.out.println("If you check out the writhing vines, type \"vines\" and press 'Enter'.\n" +
                    "If you dash outside and explore the commotion at the gazebo, type \"gazebo\" and press 'Enter'.");

            String choice = input.next();

            if (choice.equalsIgnoreCase("vines")) {
                return 2500;
            } else if (choice.equalsIgnoreCase("gazebo")) {
                return 900;
            } else {
                System.out.println("Command not recognized. Let's try again. \n");
            }
        }
    }

    private static int card300() {
        System.out.println("     You make it only a few steps across the open field before you hear a clicking sound " +
                "from around your feet that freezes you in your tracks.  Looking down, you see freshly disturbed " +
                "earth around your sneakers, as though someone had recently buried something there.  \n" +
                "     As you lift your foot to look--KA-KLICK!--the reality of the situation becomes clear.  You have " +
                "just stepped on a landmine. \n" +
                "     A noise like thunder, infinitely loud, rings out, but you never even hear it.  Instantly, " +
                "everything goes black. \n" +
                "     THE END\n");
        return 0;
    }

    private static int card400() {
        Scanner input = new Scanner(System.in);
        System.out.println("     The horseman is a dashing, bearded, Civil War soldier, his bronze face stoic.  He holds out " +
                "a cavalry sabre toward the brooding sky.  The sword's edge glints in the weak sunlight that " +
                "penetrates the thickening clouds above.  The sword looks almost new. \n" +
                "     At the base of the statue is a plaque that proclaims this as a memorial to Henry Marsden.  The plaque " +
                "reads: \n" +
                "     'Henry Marsden, born 1839, died 1887.  General in the Union Army during the Civil War.  Severely " +
                "wounded at the Battle of Shiloh in 1862.  Appointed warden of Hedge Brook Prison in 1880.' \n" +
                "     To your left is the entrace to a hedge maze.  To your right is a graying picket fence with a rickety " +
                "wooden gate.  You can see two stone angel statues and beyond them, a cemetery. \n");
        while (true) {
            System.out.println("If you examine the statue more closely, type \"statue\" and press 'Enter'. \n" +
                    "If you move on from the statue, type \"move\" and press 'Enter'.");

            String choice = input.next();

            if (choice.equalsIgnoreCase("statue")) {
                return 401;
            } else if (choice.equalsIgnoreCase("move")) {
                return 404;
            } else {
                System.out.println("Command not recognized. Let's try again. \n");
            }
        }
    }

    private static int card401() {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("If you search around the monument's base, type \"base\" and press 'Enter'. \n" +
                    "If you climb the statue to examine the sabre, type \"climb\" and press 'Enter'.");

            String choice = input.next();

            if (choice.equalsIgnoreCase("base")) {
                return 402;
            } else if (choice.equalsIgnoreCase("climb")) {
                return 403;
            } else {
                System.out.println("Command not recognized. Let's try again. \n");
            }
        }
    }

    private static int card402A(boolean challenge403Switch) {
        Scanner input = new Scanner(System.in);
        System.out.println("     When you inadvertently press a hidden switch, the statue slides to one side, revealing a " +
                "cement passage.\n");
        if (challenge403Switch) {
            while (true) {
                System.out.println("If you want to climb statue to examine the sabre, type \"climb\" and press 'Enter'. \n" +
                        "If you're ready to move on to a new area, type \"move\" and press 'Enter'.");

                String choice = input.next();

                if (choice.equalsIgnoreCase("climb")) {
                    return 403;
                } else if (choice.equalsIgnoreCase("move")) {
                    return 404;
                } else {
                    System.out.println("Command not recognized. Let's try again. \n");
                }
            }
        } else {
            System.out.println("     There's nothing else you can do with the statue.  It's time to move on.\n");
            return 404;
        }
    }

    private static int card402B(boolean challenge403Switch) {
        Scanner input = new Scanner(System.in);
        System.out.println("     You search the base thoroughly, but you don't see anything.  You're getting the " +
                "sense that it might not be safe to hang around in one place for too long.\n"); // original text
        if (challenge403Switch) {
            while (true) {
                System.out.println("If you want to climb statue to examine the sabre, type \"climb\" and press 'Enter'. \n" +
                        "If you're ready to move on to a new area, type \"move\" and press 'Enter'.");

                String choice = input.next();

                if (choice.equalsIgnoreCase("climb")) {
                    return 403;
                } else if (choice.equalsIgnoreCase("move")) {
                    return 404;
                } else {
                    System.out.println("Command not recognized. Let's try again. \n");
                }
            }
        } else {
            System.out.println("     There's nothing else you can do with the statue.  It's time to move on.\n");
            return 404;
        }
    }

    private static int card403A(boolean challenge402Switch) {
        Scanner input = new Scanner(System.in);
        System.out.println("     The sabre comes loose in your hand.  It's heavy and quite sharp.  Your psychic senses tell " +
                "you this is an important item.\n");
        if (challenge402Switch) {
            while (true) {
                System.out.println("If you want to search the monument's base, type \"base\" and press 'Enter'. \n" +
                        "If you're ready to move on to a new area, type \"move\" and press 'Enter'.");

                String choice = input.next();

                if (choice.equalsIgnoreCase("base")) {
                    return 402;
                } else if (choice.equalsIgnoreCase("move")) {
                    return 404;
                } else {
                    System.out.println("Command not recognized. Let's try again. \n");
                }
            }
        } else {
            System.out.println("     There's nothing else you can do with the statue.  It's time to move on.\n");
            return 404;
        }
    }

    private static int card403B(boolean challenge402Switch) {
        Scanner input = new Scanner(System.in);
        System.out.println("     You fall from the statue and twist your ankle when you land.  You can still walk on it, " +
                "but the distraction of the pain is going to make later challenges more difficult.\n"); // original text
        if (challenge402Switch) {
            while (true) {
                System.out.println("If you want to search the monument's base, type \"base\" and press 'Enter'. \n" +
                        "If you're ready to move on to a new area, type \"move\" and press 'Enter'.");

                String choice = input.next();

                if (choice.equalsIgnoreCase("base")) {
                    return 402;
                } else if (choice.equalsIgnoreCase("move")) {
                    return 404;
                } else {
                    System.out.println("Command not recognized. Let's try again. \n");
                }
            }
        } else {
            System.out.println("     There's nothing else you can do with the statue.  It's time to move on.\n");
            return 404;
        }
    }

    private static int card404(boolean statueSwitch) {
        Scanner input = new Scanner(System.in);
        System.out.println("     Moving on from the statue, you need to decide which area to explore next.\n");
        while (true) {
            if (statueSwitch) {
                System.out.println("If you want to see where the hidden passage leads, type \"passage\' and press " +
                        "'Enter'");
            }
            System.out.println("If you enter the hedge maze, type \"maze\" and press 'Enter'.\n" +
                    "If you move on from the statue, type \"cemetery\" and press 'Enter'.");

            String choice = input.next();

            if (statueSwitch && choice.equalsIgnoreCase("passage")) { // figuring out how to control the passage switch and modify card404 was a major cresting moment
                return 2800;
            } else if (choice.equalsIgnoreCase("maze")) {
                return 1200;
            } else if (choice.equalsIgnoreCase("cemetery")) {
                return 2100;
            } else {
                System.out.println("Command not recognized. Let's try again. \n");
            }
        }
    }

    private static int card500() {
        Scanner input = new Scanner(System.in);
        System.out.println("     The mausoleum interior feels musty and cool.  Something is dripping from the ceiling and " +
                "landing in the corner with a PLINK, which is odd, given that it hasn't started raining yet.  You also " +
                "notice the mausoleum is bigger on the inside than the outside suggested.  A stone sarcophagus lies " +
                "before you in the center of the chamber with the word MARSDEN carved into it.\n" +
                "     It appears that others have been in the mausoleum recently: there's a freshly dug pit to the side of " +
                "the sarcophagus, and an elaborate tunnel has been dug into the ground beside the nearby wall.  You " +
                "can see that the tunnel is lined with cement.\n");
        while (true) {
            System.out.println("If you examine the sarcophagus more closely, type \"examine\" and press 'Enter'.\n" +
                    "If you're ready to move on to a new place, type \"move\" and press 'Enter'.");

            String choice = input.next();

            if (choice.equalsIgnoreCase("examine")) {
                return 501;
            } else if (choice.equalsIgnoreCase("move")) {
                return 504;
            } else {
                System.out.println("Command not recognized. Let's try again. \n");
            }
        }
    }

    private static int card501() {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("If you search around the sarcophagus, type \"around\" and press 'Enter'. \n" +
                    "If you try to remove the stone lid from the sarcophagus, type \"lid\" and press 'Enter'.");

            String choice = input.next();

            if (choice.equalsIgnoreCase("around")) {
                return 502;
            } else if (choice.equalsIgnoreCase("lid")) {
                return 503;
            } else {
                System.out.println("Command not recognized. Let's try again. \n");
            }
        }
    }

    private static int card502A(boolean challenge503Switch) {
        Scanner input = new Scanner(System.in);
        System.out.println("     You find a large wooden dowel.  This could help you pry open or move heavy things.  Your " +
                "psychic senses tell you this is an important item.\n");
        if (challenge503Switch) {
            while (true) {
                System.out.println("If you want to try to open the sarcophagus, type \"lid\" and press 'Enter'. \n" +
                        "If you're ready to move on to a new area, type \"move\" and press 'Enter'.");

                String choice = input.next();

                if (choice.equalsIgnoreCase("lid")) {
                    return 503;
                } else if (choice.equalsIgnoreCase("move")) {
                    return 504;
                } else {
                    System.out.println("Command not recognized. Let's try again. \n");
                }
            }
        } else {
            System.out.println("     There doesn't seem to be anything else to do in this room.  It's time to move on.\n");
            return 504;
        }
    }

    private static int card502B(boolean challenge503Switch) {
        Scanner input = new Scanner(System.in);
        System.out.println("     You don't seem to find anything. Your intuition tells you that staying in one place " +
                "for too long isn't safe.\n");
        if (challenge503Switch) {
            while (true) {
                System.out.println("If you want to try to open the sarcophagus, type \"lid\" and press 'Enter'. \n" +
                        "If you're ready to move on to a new area, type \"move\" and press 'Enter'.");

                String choice = input.next();

                if (choice.equalsIgnoreCase("lid")) {
                    return 503;
                } else if (choice.equalsIgnoreCase("move")) {
                    return 504;
                } else {
                    System.out.println("Command not recognized. Let's try again. \n");
                }
            }
        } else {
            System.out.println("     There doesn't seem to be anything else to do in this room.  It's time to move on.\n"); // original text
            return 504;
        }
    }

    private static int card503A(boolean challenge502Switch) {
        Scanner input = new Scanner(System.in);
        System.out.println("     It takes some muscle, but you manage to remove the lid and are surprised to find that not " +
                "only is there no body, but an opening to a secret passageway offers yet another way out of the " +
                "mausoleum.\n");
        if (challenge502Switch) {
            while (true) {
                System.out.println("If you want to search the area around the sarcophagus, type \"around\" and press 'Enter'.\n" +
                        "If you're ready to move on, type \"move\" and press 'Enter'.");

                String choice = input.next();

                if (choice.equalsIgnoreCase("around")) {
                    return 502;
                } else if (choice.equalsIgnoreCase("move")) {
                    return 504;
                } else {
                    System.out.println("Command not recognized. Let's try again. \n");
                }
            }
        } else {
            System.out.println("     There doesn't seem to be anything else to do in this room.  It's time to move on.\n");
            return 504;
        }
    }

    private static int card503B(boolean challenge502Switch) {
        Scanner input = new Scanner(System.in);
        System.out.println("     The lid is much heavier than you anticipated.  While try to move it, you strain a muscle in " +
                "your shoulder.  The pain in your shoulder is gonna make later challenges more difficult.\n"); // original text
        if (challenge502Switch) {
            while (true) {
                System.out.println("If you want to search the area around the sarcophagus, type \"around\" and press 'Enter'.\n" +
                        "If you're ready to move on, type \"move\" and press 'Enter'.");

                String choice = input.next();

                if (choice.equalsIgnoreCase("around")) {
                    return 502;
                } else if (choice.equalsIgnoreCase("move")) {
                    return 504;
                } else {
                    System.out.println("Command not recognized. Let's try again. \n");
                }
            }
        } else {
            System.out.println("There doesn't seem to be anything else to do in this room.  It's time to move on.");
            return 504;
        }
    }

    private static int card504(boolean lidSwitch) {
        Scanner input = new Scanner(System.in);
        System.out.println("     Now ready to leave the mausoleum, where do you go next?\n");
        while (true) {
            if (lidSwitch) {
                System.out.println("To take the secret passageway through the sarcophagus, type \"passageway\' and press " +
                        "'Enter'");
            }
            System.out.println("If you climb into the pit, type \"pit\" and press 'Enter'.\n" +
                    "If you travel through the tunnel, type \"tunnel\" and press 'Enter'.");

            String choice = input.next();

            if (lidSwitch && choice.equalsIgnoreCase("passageway")) {
                return 50024; //story card 5 leading to clue card 24
            } else if (choice.equalsIgnoreCase("pit")) {
                return 1600;
            } else if (choice.equalsIgnoreCase("tunnel")) {
                return 2800;
            } else {
                System.out.println("Command not recognized. Let's try again. \n");
            }
        }
    }

    private static int card50024() { // story card 5 to clue card 24 to story card 12
        System.out.println("     You travel through the tunnel for what feels like forever.  The light disappears, and the " +
                "tunnel eventually ends.  You feel frightened and trapped.  You want to run back and try the other routes " +
                "out of the mausoleum.\n" +
                "     Before you go, you feel around in the dark.  There's nothing in front of you or two your sides, but you " +
                "discover a mossy hatch in the ceiling.  You turn the handle, and the hatch opens on to a grassy " +
                "patch at the entrance to a hedge maze.\n");
        return 1200;
    }

    private static int card600() {
        Scanner input = new Scanner(System.in);
        System.out.println("     Just as you reach for the doorknob, a fierce gust of wind violently flings open the door.  " +
                "The windows are all wide open, and the wind continues to rush through the quarters, blowing papers " +
                "off tables and knocking an umbrella stand to the ground with a CRASH.\n" +
                "     Your arm accidentally knocks a teacup off the kitchen counter, which shatters on the floor.  You start " +
                "to feel nervous.\n" +
                "     You notice a phone on the wall.  This might be too much to handle alone.  You grab the phone and call " +
                "Sergeant Morrison.\n" +
                "     \"Hedge Brook Police Station. Sergeant Morrison speaking,\" he says.\n" +
                "     \"Sergeant Morrison!\" you blurt out.  \"It's me!  I'm on the grounds of the Marsden house!  I might " +
                "be in trouble!\"\n" +
                "     \"Hello? Hello?\' says the sergeant impatiently.\n" +
                "     \"It's me!\n you shout back. \"I need your help!\"\n" +
                "     \"Hello?\n Sergeant Morrison says, exasperated. \"Good-bye!\"\n" +
                "     He hangs up!\n" +
                "     You are unsure why the sergeant couldn't hear you, but you are now distracted by a swirl of sounds: " +
                "a haunting violin plays somewhere outside, while a wild and chaotic noise rises from a gazebo in the " +
                "distance.\n");
        while (true) {
            System.out.println("If you move in the direction of the violin, type \"violin\" and press 'Enter'.\n" +
                    "If you check out the gazebo, type \"gazebo\" and press 'Enter'.");

            String choice = input.next();

            if (choice.equalsIgnoreCase("violin")) {
                return 1700;
            } else if (choice.equalsIgnoreCase("gazebo")) {
                return 900;
            } else {
                System.out.println("Command not recognized. Let's try again. \n");
            }
        }
    }

    private static int card700() {
        Scanner input = new Scanner(System.in);
        System.out.println("     You pull yourself over the rusting gate and land with a CRUNCH on the gravel driveway " +
                "leading toward the house.  But before you can survey your surroundings, you hear a guttural sound " +
                "coming from your left.\n" +
                "     You encounter a shadowy, hunched-over figure emerging from the darkened doorway of a decrepit " +
                "gatehouse.  You can just barely make out eyes and white fangs dripping with saliva.\n" +
                "     The figure crouches as if to spring forward at any moment.\n" +
                "     \"Who's th--there?\" you stammer.  Suddenly, the creature lunges at you, snarling.  You spot a " +
                "guardhouse not far away.  If you can get past the creature, you might be able to hide there.  Or " +
                "perhaps you should just turn and flee up the driveway toward the main house!\n");
        while (true) {
            System.out.println("If you fight the creature, type \"fight\" and press 'Enter'.\n" +
                    "If you run, type \"run\" and press 'Enter'.");

            String choice = input.next();

            if (choice.equalsIgnoreCase("fight")) {
                return 701;
            } else if (choice.equalsIgnoreCase("run")) {
                return 702;
            } else {
                System.out.println("Command not recognized. Let's try again. \n");
            }
        }
    }

    private static int card701A() {
        System.out.println("     It's probably unwise to engage such a savage beast in combat, but Danger is your middle name.  " +
                "You land a few quick jabs on the creature before it can react, and then you throw it to the ground.  " +
                "You stand there for a moment, your confidence high.  Then, the creature leaps to its feet and rushes you.  " +
                "You managed to win Round One, but you're in no hurry to start Round Two, so you race for the shadows " +
                "beside a big boulder before the creature can get its hands on you.\n");
        return 1900;
    }

    private static int card701B() {
        System.out.println("     The creature charges you and knocks you onto your back.  As you get to your feet, " +
                "you see it has retreated and is preparing for a second charge.  Whatever this savage beast is, " +
                "it's beyond your strength.  You have to make a run for it.\n");
        // original text
        return 702;
    }

    private static int card702() {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("If you run into the guardhouse, type \"guardhouse\" and press 'Enter'.\n" +
                    "If you run up the driveway, type \"driveway\" and press 'Enter'.");

            String choice = input.next();

            if (choice.equalsIgnoreCase("guardhouse")) {
                return 1900;
            } else if (choice.equalsIgnoreCase("driveway")) {
                return 800;
            } else {
                System.out.println("Command not recognized. Let's try again.\n");
            }
        }
    }

    private static int card800() {
        Scanner input = new Scanner(System.in);
        System.out.println("     Your heart pounding, you bolt up the driveway, which bends around the back side of the " +
                "manor.  After running about fifty yards, you slow down, out of breath. Gasping for air, you stop at a " +
                "large wall of thorny hedges lining one side of the driveway.  You hear water trickling down a ditch on " +
                "the opposite side of the driveway.  Charcoal-gray clouds are massing ominously on the horizon, and the " +
                "nearby tree branches rattle with the sudden gusts of wind.\n" +
                "     Before you can catch your breath, a dark-windowed limousine roars around the bend--you only have a " +
                "split second to decide which way to go to avoid being hit!\n");
        while (true) {
            System.out.println("If you dash through the hedges, type \"hedges\" and press 'Enter'.\n" +
                    "If you jump into the ditch, type \"ditch\" and press 'Enter'.");

            String choice = input.next();

            if (choice.equalsIgnoreCase("hedges")) {
                return 1500;
            } else if (choice.equalsIgnoreCase("ditch")) {
                return 2600;
            } else {
                System.out.println("Command not recognized. Let's try again. \n");
            }
        }
    }

    private static int card900(int psychicLevel) {
        Scanner input = new Scanner(System.in);
        System.out.println("     You spring to the gazebo, practically pushed along by the winds that are picking up.  " +
                "A light sprinkling of rain spatters the ground as you run.\n" +
                "     You make it to the shelter of the structure, and the mayhem occurring above you on the roof " +
                "increases in intensity.\n" +
                "     'Who is up there, and what are they doing?' you wonder.\n" +
                "     You notice a driveway about twenty feet away.\n");
        if (psychicLevel > 1) {
            System.out.println("     You suddenly feel a sense of the uncanny as you stand in the gazebo.  The sound of " +
                    "the raindrops pattering and the wavy lines of the cloud formations take you out of yourself for a " +
                    "moment, and in your mind's eye you see a hazy picture: a door, open just a crack; behind the door " +
                    "is a bright light that shines through the cracked opening as well as the keyhole.  As the vision " +
                    "fades and you come back to the present moment, you decide that you need to commit this picture to" +
                    "memory before returning your attention to what's immediately around you.\n");
        }
        while (true) {
            System.out.println("If you climb to the top of the gazebo, type \"climb\" and press 'Enter'. \n" +
                    "If you run to the driveway, type \"driveway\" and press 'Enter'.");

            String choice = input.next();

            if (choice.equalsIgnoreCase("climb")) {
                return 1000;
            } else if (choice.equalsIgnoreCase("driveway")) {
                return 3000;
            } else {
                System.out.println("Command not recognized. Let's try again. \n");
            }
        }
    }

    private static int card1000() {
        System.out.println("     You stand on the gazebo's railing, steadying yourself by gripping an ornate post " +
                "holding up the roof.  The rumbling above sounds and feels frightening--what are you getting yourself " +
                "into? \n" +
                "     Reluctant to barge into the middle of this situation, you raise yourself just enough for a peek " +
                "and discover that there is no one on the gazebo roof.  The commotion is actually a large satellite " +
                "dish, broken into three pieces.  The big, jagged fragments are still connected to the base by wires, " +
                "and the violent winds are spinning them in a circle with great force.\n" +
                "     Flailing wildly like an angry octopus, the satellite dish almost hits you in the face.\n");
        return 1001;
    }

    private static int card1001A() { // story card 10 clue card 22 clue card 7
        System.out.println("You hold on to the top of the gazebo with one hand and time your lunge perfectly--you snag " +
                "a chunk of the whirling satellite dish.\n" +
                "     The piece appears to be made by hand.  An engraving on it reads PLANET OF CRYSTALS.\n" +
                "     Your psychic senses tell you this is an important item.  You look to your left and see a path " +
                "to a driveway that might be the front of the house.  You jump off the gazebo and run to check it out. \n");
        return 3000;
    }

    private static int card1001B() { // story card 10 clue card 17
        System.out.println("     Your fingertips graze a piece of the satellite dish, but you can't quite grab it.  " +
                "You reach too far, lose your balance, and tumble from the gazebo and down a short hill.\n" +
                "     Your confusion from the fall slowly subsides, and you hear the sound of a beautiful violin " +
                "nearby.  You stumble off in the direction of the music.\n");
        return 1700;
    }

    private static int card1100() {
        Scanner input = new Scanner(System.in);
        System.out.println("     You can tell that the pool house was once quite luxurious.  It contains half a dozen " +
                "private rooms and showers, as well as an ornate mahogany bar in the common area.  It must have been " +
                "fun to hang out in this place in its glory days.  Those thoughts fade as the sounds of a " +
                "disturbance erupt from the top of a gazebo in the distance.\n" +
                "     And now you can hear a lone violin playing a soothing melody.\n");
        while (true) {
            System.out.println("If you investigate the gazebo, type \"gazebo\" and press 'Enter'. \n" +
                    "If you follow the sound of the violin, type \"sound\" and press 'Enter'.");

            String choice = input.next();

            if (choice.equalsIgnoreCase("gazebo")) {
                return 900;
            } else if (choice.equalsIgnoreCase("sound")) {
                return 1700;
            } else {
                System.out.println("Command not recognized. Let's try again. \n");
            }
        }
    }

    private static int card1200(boolean map) {
        Scanner input = new Scanner(System.in);
        if (map) {
            System.out.println("     The hedge maze is massive.  It's thick hedge walls are twice as tall as you but " +
                    "don't seem stable enough to climb.  Fortunately you have what appears to be a map, and the " +
                    "directions are clear: first LEFT, then RIGHT, then LEFT again for easy path through.");
        } else {
            System.out.println("     The hedge maze is massive.  Its thick hedge walls are twice as tall as you but don't " +
                    "seem stable enough to climb, so you'll have to solve this labyrinth the old-fashioned way!  You take " +
                    "a deep breath to steady your nerves and head through the maze's entrance.\n");
        }
        while (true) {
            System.out.println("Which direction will you go first? Type \"left\" or \"right\" and press 'Enter'.");

            String choice = input.next();

            if (choice.equalsIgnoreCase("left")) {
                return 120009; // story card 12 clue card 9
            } else if (choice.equalsIgnoreCase("right")) {
                return 120001; // story card 12 clue card 1
            } else {
                System.out.println("Command not recognized. Let's try again. \n");
            }
        }
    }

    private static int card120001() {
        System.out.println("     You turn and follow a path for several minutes.  Wait . . . this looks familiar . . ." +
                "You feel a bit lost and disoriented for a while, but you manage to get back on track.\n"); //contains original text
        return 120011; // story card 12 clue card 11
    }

    private static int card120009() {
        Scanner input = new Scanner(System.in);
        System.out.println("     You turn and follow a path deeper into the maze.  You feel like you're going in the " +
                "right direction. \n");
        while (true) {
            System.out.println("Which direction will you go now? Type \"left\" or \"right\" and press 'Enter'.");

            String choice = input.next();

            if (choice.equalsIgnoreCase("left")) {
                return 120011; // story card 12 clue card 11
            } else if (choice.equalsIgnoreCase("right")) {
                return 120012; // story card 12 clue card 12
            } else {
                System.out.println("Command not recognized. Let's try again. \n");
            }
        }
    }

    private static int card120011() {
        System.out.println("You keep going.  And going.  It seems like you've just walked in a circle!  Minutes stretch " +
                "to upwards of an hour before you get your bearings and get back on track.  \n"); // contains original text
        return 120012;
    }

    private static int card120012() {
        Scanner input = new Scanner(System.in);
        System.out.println("You feel like you might be getting close to the end of the maze!");
        while (true) {
            System.out.println("Which direction will you go now? Type \"left\" or \"right\" and press 'Enter'.");

            String choice = input.next();

            if (choice.equalsIgnoreCase("left")) {
                return 120013; // story card 12 clue card 13
            } else if (choice.equalsIgnoreCase("right")) {
                return 120014; // story card 12 clue card 14
            } else {
                System.out.println("Command not recognized. Let's try again. \n");
            }
        }
    }

    private static int card120013() {
        System.out.println("     Finally you see it . . . The end of the maze!");
        return 1800;
    }

    private static int card120014() {
        System.out.println("You suddenly feel very lost.  You'd think you'd be better at this by now . . .  The sense of danger " +
                "and the dampening of your psychic senses press down on you as you feel stir-crazy for being in here " +
                "for so long.\n"); // contains original text
        return 1800;
    }

    private static int card1300() {
        Scanner input = new Scanner(System.in);
        System.out.println("     Moving along the mossy stone wall that surrounds the property, you come across a " +
                "jagged opening created by fallen rocks--it's just big enough for you to squeeze through.  Once " +
                "on the other side of the wall, you find yourself standing in a cobblestone plaza surrounded by " +
                "marble and bronze figures.  Most of the sculptures depict men gazing off into the distance as if " +
                "pondering the deeper meaning of it all, but at the edge of the courtyard is a monumental statue " +
                "of a man atop a muscular steed. \n" +
                "     To your right, a stony pathway leads away from the statuary and into a picturesque garden, " +
                "where topiary bushes have been trimmed into whimsical shapes.\n");
        while (true) {
            System.out.println(" If you inspect the statue of the man on the horse, type \"statue\" and press 'Enter'.\n" +
                    "If you walk toward the topiary bushes, type \"bushes\" and press 'Enter'.");

            String choice = input.next();

            if (choice.equalsIgnoreCase("statue")) {
                return 400;
            } else if (choice.equalsIgnoreCase("bushes")) {
                return 1500;
            } else {
                System.out.println(" Command not recognized. Let's try again.\n");
            }
        }
    }

    private static int card1400(boolean box) {
        Scanner input = new Scanner(System.in);
        System.out.println("     You climb down the gnarled vine into a walled courtyard beside an outbuilding that appears " +
                "to be the servants' quarters.  The door is slightly ajar, but you are unsure if anyone is inside.  ");

        if (box) {
            System.out.println("In the courtyard there is a small table with a cigar box sitting on top of it.  ");
        }

        System.out.println("There is also a path that leads out of the courtyard and up to the side of the mountain.  ");

        if (box) {
            while (true) {
                System.out.println(" If you check out what's in the cigar box, type \"box\" and press 'Enter'. \n" +
                        "If you want to move on from this area, type \"move\" and press 'Enter'.");

                String choice = input.next();

                if (choice.equalsIgnoreCase("box")) {
                    return 1401;
                } else if (choice.equalsIgnoreCase("move")) {
                    return 1402;
                } else {
                    System.out.println(" Command not recognized. Let's try again. \n");
                }
            }
        } else {
            return 1402;
        }
    }

    private static int card1401() {
        System.out.println("     The cigar box contains a flashlight.  You keep this item.  It's now time to move on. ");
        return 1402;
    }

    private static int card1402() {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println(" If you approach the door to the servants' quarters, type \"door\" and press 'Enter'. \n" +
                    "If you run to the side of the mansion, type \"side\" and press 'Enter'.");

            String choice = input.next();

            if (choice.equalsIgnoreCase("door")) {
                return 600;
            } else if (choice.equalsIgnoreCase("side")) {
                return 2000;
            } else {
                System.out.println("Command not recognized. Let's try again. \n");
            }
        }
    }

    private static int card1500(boolean shears) {
        Scanner input = new Scanner(System.in);
        System.out.println("     You emerge into the clearing.  Manicured bushes in the shapes of fish, swans, and rabbits " +
                "perch atop a well-kept lawn.  ");

        if (shears) {
            System.out.println("     One larger shrub has been sculpted to look like an outstretched hand with its palm " +
                    "upturned.  You see a black handle of some kind sticking up out of one of the fingertips.");
        }

        System.out.println("     A brick path winds through the shrubs and splits into two paths in the distance.  One " +
                "of the leads towards a rickety wooden gate flanked by a pair of stone angel statues.  The other path " +
                "leads into an open field, across which you can see the front door of the Marsden manor.  ");

        if (shears) {
            while (true) {
                System.out.println(" To pull the handle out of the bush, type \"bush\" and press 'Enter'. \n" +
                        "If you want to move on from this area, type \"move\" and press 'Enter'.");

                String choice = input.next();

                if (choice.equalsIgnoreCase("bush")) {
                    return 1501;
                } else if (choice.equalsIgnoreCase("move")) {
                    return 1502;
                } else {
                    System.out.println(" Command not recognized. Let's try again. \n");
                }
            }
        } else {
            return 1502;
        }
    }

    private static int card1501() {
        System.out.println("     You pull a pair of garden shears from the shrub.  They could help you pry " +
                "something open.  You keep this item.  It's now time to move on. ");
        return 1502;
    }

    private static int card1502() {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println(" If you walk through the wooden gate, type \"gate\" and press 'Enter'. \n" +
                    "If you head across the field toward the manor's front door, type \"field\" and press 'Enter'.");

            String choice = input.next();

            if (choice.equalsIgnoreCase("gate")) {
                return 2100;
            } else if (choice.equalsIgnoreCase("field")) {
                return 300;
            } else {
                System.out.println(" Command not recognized. Let's try again. \n");
            }
        }
    }

    private static int card1600() {
        System.out.println("     Without warning, the earthen walls begin to collapse around you, and before you can " +
                "react, you are up to your waist in dirt.  You write and twist, trying to escape, but it only causes " +
                "more soil to cascade down.  Soon it's up to your shoulders, then your neck, then your cheeks.  You " +
                "struggle to spit the soil out as it fills your mouth, but within moments you are fully buried.  You " +
                "can only see the dark earth in front of your eyes.  Your hand closes around a metal disc--perhaps " +
                "a coin?  You'll never know, though, as the soil fills your lungs, and the world wavers and goes " +
                "gray before finally turning black.  ");
        return 0;
    }

    private static int card1700() {
        Scanner input = new Scanner(System.in);
        System.out.println("     You move further toward the hypnotic sound of the distant violin, which is oddly " +
                "calming and uplifting even as the winds increase around you.\n" +
                "     You notice there is a driveway up in the distance, but before you get there, you arrive at a " +
                "horse stable with an open gate.  Inside, sitting on a stool, is the source of the violin music: a " +
                "chimpanzee playing his heart out, a soulful expression on his face.\n" +
                "     The chimp is fully committed to the music.  You have never heard such an emotional performance.\n" +
                "     It's . . . it's beautiful.");
        while (true) {
            System.out.println(" If you leave the stable and run to the driveway, type \"driveway\" and press 'Enter'. \n" +
                    "If you tiptoe through the gate to experience the full power of the performance, type \"music\" and press 'Enter'.");

            String choice = input.next();

            if (choice.equalsIgnoreCase("driveway")) {
                return 3000;
            } else if (choice.equalsIgnoreCase("music")) {
                return 2400;
            } else {
                System.out.println(" Command not recognized. Let's try again. \n");
            }
        }
    }

    private static int card1800(boolean lockbox) {
        Scanner input = new Scanner(System.in);
        System.out.println("     You finally come to the end of the hedge maze.  It exits toward a pool house.  ");

        if (lockbox) {
            System.out.println("     A short stone pedestal stands in front of you with a metal lockbox on top.  Perhaps " +
                    "someone wants to reward you for navigating that accursed maze, though the whole thing does seem " +
                    "suspicious.");
        }

        System.out.println("     Looking toward the pool house, you see its door is barely hanging from its hinges.  " +
                "There is also a gate that leads--you assume--directly to the pool.");

        if (lockbox) {
            while (true) {
                System.out.println(" To see if the lockbox is open, type \"box\" and press 'Enter'. \n" +
                        "If you want to move on from this area, type \"move\" and press 'Enter'.");

                String choice = input.next();

                if (choice.equalsIgnoreCase("box")) {
                    return 1801;
                } else if (choice.equalsIgnoreCase("move")) {
                    return 1802;
                } else {
                    System.out.println(" Command not recognized. Let's try again. \n");
                }
            }
        } else {
            return 1802;
        }
    }

    private static int card1801() {
        System.out.println("     Not only is the lockbox open, but inside you find a key to a truck.  Your psychic " +
                "senses tell you this is an important item.");
        return 1802;
    }

    private static int card1802() {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println(" If you explore the pool house, type \"house\" and press 'Enter'.  " +
                    "If you walk through the gate to check out the pool, type \"gate\" and press 'Enter'. ");

            String choice = input.next();

            if (choice.equalsIgnoreCase("house")) {
                return 1100;
            } else if (choice.equalsIgnoreCase("gate")) {
                return 2300;
            } else {
                System.out.println(" Command not recognized. Let's try again. \n");
            }
        }
    }

    private static int card1900() { // challenge and battery item omitted
        Scanner input = new Scanner(System.in);
        System.out.println("     You were lucky to escape the creature, but you know it's still out there . . . somewhere.  " +
                "You run into the old guardhouse, which is a small room with several TV monitors flashing black-and-white " +
                "images of various places on the estate grounds.  Some monitors are broken, and shards of glass are " +
                "scattered across a desk and the wood floors.\n" +
                "     A hefty book titled 'History of Nothwin County' is lying on the desk.  Curious, you look up the " +
                "name 'Marsden, Henry' in the index.  Sure enough, it references en entry on Page 93.  Your heart races " +
                "as you turn there to read this bio:\n" +
                "\n" +
                "     'Henry Marsden, born 1839, died 1887.  General in the Union Army during the Civil War.  Severely " +
                "wounded at the Battle of Shiloh in 1862.  Appointed warden of Hedge Brook Prison in 1880.  Rumored to " +
                "have been killed in the Prison Riot Fire of 1887.'\n" +
                "\n" +
                "     'Not a popular guy,' you think.\n" +
                "     A wooden ladder leads up to a hatch in the roof.  Through a window filled with cobwebs you can " +
                "see an open field that leads to the manor's front door.  You consider what to do next.");
        while (true) {
            System.out.println(" If you climb the ladder to the hatch in the roof, type \"roof\" and press 'Enter'. \n" +
                    "If you crawl through the window and run for the front door of the house, type \"field\" and press 'Enter'.");

            String choice = input.next();

            if (choice.equalsIgnoreCase("roof")) {
                return 2700;
            } else if (choice.equalsIgnoreCase("field")) {
                return 300;
            } else {
                System.out.println(" Command not recognized. Let's try again. \n");
            }
        }
    }

    private static int card2000() {
        Scanner input = new Scanner(System.in);
        System.out.println("     Running along the side of the house, you discover that it is a tight squeeze between " +
                "the house and the fence.  You almost have to shuffle sideways to make it through, which makes you " +
                "claustrophobic.\n" +
                "     One of nowhere, you hear the sound of a lone violin playing a gorgeous, flowing melody with " +
                "expert skill and confidence.\n" +
                "     There is a clearing up ahead, though you are unsure of what lies at its end.  And the space you " +
                "are in has become so tight, it would be easier to climb over the fence to check out the violinist " +
                "playing that amazing melody.");
        while (true) {
            System.out.println(" If you run toward the clearing, type \"clearing\" and press 'Enter'. \n" +
                    "If you climb over the fence to follow the violin melody, type \"melody\" and press 'Enter'.");

            String choice = input.next();

            if (choice.equalsIgnoreCase("clearing")) {
                return 3000;
            } else if (choice.equalsIgnoreCase("melody")) {
                return 1700;
            } else {
                System.out.println(" Command not recognized. Let's try again. \n");
            }
        }
    }

    private static int card2100() {
        Scanner input = new Scanner(System.in);
        System.out.println("     Passing between a pair of stone angels, you enter an old family cemetary.  There is a " +
                "marble mausoleum in the center of the cemetary.  A short set of stairs leads into its shadowy " +
                "interior.\n" +
                "\n" +
                "     Next to where you stand, a freshly dug grave yawns in the pale sunlight.  It's unsettling to think " +
                "of climbing into it, but you see something shiny embedded in the dirt walls.");
        while (true) {
            System.out.println(" If you enter the mausoleum, type \"mausoleum\" and press 'Enter'. \n" +
                    "If you climb into the open grave, type \"grave\" and press 'Enter'.");

            String choice = input.next();

            if (choice.equalsIgnoreCase("mausoleum")) {
                return 500;
            } else if (choice.equalsIgnoreCase("grave")) {
                return 1600;
            } else {
                System.out.println(" Command not recognized. Let's try again. \n");
            }
        }
    }

    private static int card2200() {
        System.out.println("     Mustering all the courage you can, you dive into the watery tunnel.  There is just " +
                "enough room in the tunnel above the water for you to lift your head between strokes and take a breath.\n" +
                "     Eventually, the tunnel drops lower and lower until it's completely submerged under water.  You " +
                "hold your breath, dive down, and look around: after about thirty feet, the tunnel opens up to a " +
                "bigger body of water--a pond or pool--with sunlight beaming into it.  You pop up for air.  'Well, " +
                "I've come this far,' you think.  You're ready to chance it.  You take a deep breath and dive back " +
                "down.\n" +
                "     You get ten feet in . . . fifteen feet in . . . twenty-five feet in . . . Just as you're about to " +
                "exit the underwater tunnel, something tugs on your leg.  You can't tell if it's an animal or if you're " +
                "caught in an underwater vine.");
        return 2201;
    }

    private static int card220020() { // story card 22 clue card 20
        System.out.println("     The thing--whatever it is--wraps more tightly around your leg.  It's pulling your down!  " +
                "Another tendril (or tentacle?) slides around your neck.  You pry it off, and with the last of your " +
                "strength, you give a powerful kick, and you're free.  Just like that, the thing is gone.  You emerge " +
                "into a swimming pool with a lush pool house next to it.");
        return 2300;
    }

    private static int card2300(boolean challengeSwitch) {
        Scanner input = new Scanner(System.in);
        System.out.println("     It's obvious that nobody has cleaned the pool in ages.  The water is a murky green, and " +
                "the surface is littered with leaves and branches.  Ripples pulse outward from the center of the pool.\n" +
                "     Out of nowhere, you hear a commotion.  You look around and wonder if it's coming from inside the " +
                "pool house nearby.  Then you see movement on top of a gazebo in the distance.  Someone--or something--" +
                "is engaged in a struggle up there.  Maybe they need your help!  Then again, if you offer assistance " +
                "you might end up needing help yourself!");
        if (challengeSwitch) {
            while (true) {
                System.out.println(" If you investigate the ripples in the pool, type \"pool\" and press 'Enter'. \n" +
                        "If you want to move on, type \"move\" and press 'Enter'.");

                String choice = input.next();

                if (choice.equalsIgnoreCase("pool")) {
                    return 2301;
                } else if (choice.equalsIgnoreCase("move")) {
                    return 2304;
                } else {
                    System.out.println(" Command not recognized. Let's try again. \n");
                }
            }
        } else {
            return 2304;
        }
    }

    private static int card2302() { // story card 23 clue card 8 and 21
        System.out.println("     You walk down the steps into the water and see what's making the waves:  a strange, " +
                "whirring metal sphere, slightly bigger than a softball.  You impulsively grab it.\n" +
                "     The sphere vibrates in your hand.  There are two buttons on it.  You press one.  Nothing happens.  " +
                "You press the other button.  The sphere continues to vibrate.  Instinctively, you press both buttons " +
                "at the same time.  The sphere stops moving and begins to glow.\n" +
                "     Your psychic senses tell you this is an important item.");
        return 2304;
    }

    private static int card2303() {
        Scanner input = new Scanner(System.in);
        System.out.println("     While moving through the water you lose your equilibrium and your head goes under " +
                "unexpectedly.  You inhale a small amount of water, prompting a fierce, painful coughing fit and a " +
                "mild wave of nausea as the slimy water goes in and then forcibly back out of your mouth.  You're okay, " +
                "but slightly worse for the wear."); // original text
        while (true) {
            System.out.println(" If you try to investigate the ripples in the pool again, type \"pool\" and press 'Enter'. \n" +
                    "If you want to move on, type \"move\" and press 'Enter'.");

            String choice = input.next();

            if (choice.equalsIgnoreCase("pool")) {
                return 2301;
            } else if (choice.equalsIgnoreCase("move")) {
                return 2304;
            } else {
                System.out.println(" Command not recognized. Let's try again. \n");
            }
        }
    }

    private static int card2304() {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println(" If you go to the pool house, type \"house\" and press 'Enter'. \n" +
                    "If you go straight to the action at the gazebo, type \"gazebo\" and press 'Enter'.");

            String choice = input.next();

            if (choice.equalsIgnoreCase("house")) {
                return 1100;
            } else if (choice.equalsIgnoreCase("gazebo")) {
                return 900;
            } else {
                System.out.println(" Command not recognized. Let's try again. \n");
            }
        }
    }

    private static int card2400() {
        System.out.println("   You tiptoe through the open gate, eager to hear the finale of the chimp's violin piece.  " +
                "Quietly . . . quietly . . .\n" +
                "     With your third step, you trigger a motion-sensor light that completely illuminates the interior " +
                "of the building.  Apparently, this is no stable: it's a kennel.  Twenty Doberman Pinschers were " +
                "peacefully enjoying the concert, but now they glare at you with anger in their eyes.\n" +
                "     The chimp frowns and slowly points his violin bow toward you.  The Dobermans respond and rush to " +
                "attack you and then eat you alive.  The last thing you see is the chimpanzee violinist laughing at " +
                "your fate.  So embarrassing!");
        return 0;
    }

    private static int card2500() {
        System.out.println("     As soon as you take a step toward the vines, one of them lashes out and wraps around " +
                "your neck.  Then another whips around your waist.  More and more vines spring out at you.\n" +
                "     'This isn't really happening,' you think.\n" +
                "     The vines are moving all around you, spinning into a cocoon.  You struggle to break free of them, " +
                "but they only tighten their grip on you.  'This can't be real!'  Eventually, you can't breathe.  " +
                "Everything seems to turn a deep green, and then you see a bright white light--and then you no longer " +
                "exist.");
        return 0;
    }

    private static int card2600(boolean paper) {
        Scanner input = new Scanner(System.in);
        System.out.println("    You land in a ditch, splashing into shallow, frigid water.  At this point, you notice a " +
                "large estate ahead of you, which partially blocks the entrance to a dark, cement culvert that the " +
                "water flows into.  If you bent over, you could walk under the lower rim of the grate and enter the " +
                "culvert.\n" +
                "     Along the side of the ditch is a dusty path leading toward what appears to be an elaborate " +
                "hedge maze.\n");
        if (paper) {
            System.out.println("     You then see a small piece of paper drifting by you in the water.  You might be " +
                    "able to grab it if you act fast.");
            while (true) {
                System.out.println(" If you try to grab the paper, type \"paper\" and press 'Enter'. \n" +
                        "If you ignore the paper and want to move on, type \"move\" and press 'Enter'.");

                String choice = input.next();

                if (choice.equalsIgnoreCase("paper")) {
                    return 2601;
                } else if (choice.equalsIgnoreCase("move")) {
                    return 2602;
                } else {
                    System.out.println(" Command not recognized. Let's try again. \n");
                }
            }
        } else {
            return 2602;
        }
    }

    private static int card2601A() {
        System.out.println("     The paper looks like a map to the hedge maze.  Your psychic senses tell you this is " +
                "an important item.");
        return 2602;
    }

    private static int card2601B() {
        System.out.println("     You reach for the paper, but it slips beyond your reach and floats down the ditch.  " +
                "It's gone.");
        return 2602;
    }

    private static int card2602() {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println(" If you enter the culvert, type \"culvert\" and press 'Enter'. \n" +
                    "If you enter the hedge maze, type \"maze\" and press 'Enter'.");

            String choice = input.next();

            if (choice.equalsIgnoreCase("culvert")) {
                return 2800;
            } else if (choice.equalsIgnoreCase("maze")) {
                return 1200;
            } else {
                System.out.println(" Command not recognized. Let's try again. \n");
            }
        }
    }

    private static int card2700(boolean lootable) {
        Scanner input = new Scanner(System.in);
        System.out.println("     You scramble up the ladder, through the hatch, and onto the guardhouse's decaying " +
                "tile roof.  It seems to be on the verge of collapsing, but you find a spot that you are reasonably " +
                "sure won't cave in when you put your weight on it.");
        if (lootable) {
            System.out.println("     Across the dangerously unstable roof from where you crouch uneasily, you can see a pile of " +
                    "construction materials, probably left over by contractors working on the roof.  Among the material is " +
                    "first aid kit, but navigating the length of the roof to reach it will be perilous.  One wrong step " +
                    "and you could stumble off the roof, into a ditch you see below.");
            while (true) {
                System.out.println(" If you try to reach the first aid kit, type \"kit\" and press 'Enter'. \n" +
                        "If you decide leave it, type \"leave\" and press 'Enter'.");

                String choice = input.next();

                if (choice.equalsIgnoreCase("kit")) {
                    return 2701;
                } else if (choice.equalsIgnoreCase("leave")) {
                    return 2702;
                } else {
                    System.out.println(" Command not recognized. Let's try again. \n");
                }
            }
        } else {
            return 2702;
        }
    }

    private static int card2701A() { // success; clue card 6
        System.out.println("     You reach and claim the first aid kit, which is fully stocked.  The area with the " +
                "discarded pile of materials is quite sturdy, so you sit and make yourself comfortable while you " +
                "sanitize, bandage, and wrap your various scrapes and maladies.  You feel refreshed and much better " +
                "equipped to handle the challenges ahead of you."); // contains original text
        return 2702;
    }

    private static int card2701B() { // failure
        System.out.println("     You make a single misstep.  You slip and tumble, sliding off of the roof into " +
                "a ten-foot-fall and SPLASH!"); // original text
        return 2600;
    }

    private static int card2702() {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println(" If you cross to the greenhouse, type \"greenhouse\" and press 'Enter'. \n" +
                    "If you climb down the vine, type \"vine\" and press 'Enter'.");

            String choice = input.next();

            if (choice.equalsIgnoreCase("greenhouse")) {
                return 2900;
            } else if (choice.equalsIgnoreCase("vine")) {
                return 1400;
            } else {
                System.out.println(" Command not recognized. Let's try again. \n");
            }
        }
    }

    private static int card2800() {
        Scanner input = new Scanner(System.in);
        System.out.println("     You creep through the darkness and find the cement walls end as natural stone and " +
                "earth begin.  Occasional vents to the surface let in just barely enough light to see by.  Ahead " +
                "you glimpse the warm firelight of torches.\n" +
                "     You come to a fork in the tunnel, lit by the dancing flames.  One tunnel descends deeper and is " +
                "half-filled with water.  You could swim through it, but you can't see where the tunnel leads or how " +
                "far it goes.\n" +
                "     Another tunnel looks partially caved in.  Tiny clumps of earth periodically fall from the ceiling " +
                "as you approach this tunnel, and several of the supports that hold the walls up have gaping cracks " +
                "in them. ");
        while (true) {
            System.out.println(" If you dive into the water-filled tunnel, type \"water\" and press 'Enter'. \n" +
                    "If you explore the partially collapsed tunnel, type \"collapsed\" and press 'Enter'.");

            String choice = input.next();

            if (choice.equalsIgnoreCase("water")) {
                return 2200;
            } else if (choice.equalsIgnoreCase("collapsed")) {
                return 1600;
            } else {
                System.out.println(" Command not recognized. Let's try again. \n");
            }
        }
    }

    private static int card2900() {
        Scanner input = new Scanner(System.in);
        System.out.println("After crossing the precarious board, you find yourself at one end of a walkway that spans " +
                "the length of the greenhouse roof.  From here you can see most of the mansion's vast grounds, which " +
                "are a little out of place amid the surrounding suburban neighborhood.  The air is full of mosquitoes " +
                "and other buzzing insects.  The clouds you saw on the horizon earlier seem to be closer now.  You see " +
                "that there's an open access door in the roof that would allow you to descend into the greenhouse.  You " +
                "can also drop down onto a path, which appears to lead to the side of the mansion itself.");
        while (true) {
            System.out.println(" If you wriggle through the access door to enter the greenhouse, type \"door\" and press 'Enter'. \n" +
                    "If you drop onto the path and run to the side of the house, type \"path\" and press 'Enter'.");

            String choice = input.next();

            if (choice.equalsIgnoreCase("door")) {
                return 200;
            } else if (choice.equalsIgnoreCase("path")) {
                return 2000;
            } else {
                System.out.println(" Command not recognized. Let's try again. \n");
            }
        }
    }

    private static int card3000() {
        Scanner input = new Scanner(System.in);
        System.out.println("     You appear in a driveway, which leads you to the mansion's entrance.  On the door is " +
                "a plaque that reads MARSDEN and a large crystal doorknocker, which seems newer than everything else on " +
                "the front of the building.  You knock loudly, many times.  But there is no answer.  The storm is really " +
                "picking up now.  You try the doorknob and are surprised to find that the door is unlocked.\n" +
                "     You've been lucky enough so far, but you wonder if you've missed something.  Before you enter the " +
                "house, you look back.  You can see a few clear paths.  One leads toward a statuary, another to a small " +
                "cemetary.  Two more paths stretch out toward a watery ditch with a gate and the house's luxurious " +
                "pool.  You could go back to explore if you want.");
        while (true) {
            System.out.println(" If you want to go back to explore, type \"explore\" and press 'Enter'. \n" +
                    "If you're ready to enter the house, type \"house\" and press 'Enter'.");

            String choice = input.next();

            if (choice.equalsIgnoreCase("explore")) {
                return 3001;
            } else if (choice.equalsIgnoreCase("house")) {
                return 3100;
            } else {
                System.out.println(" Command not recognized. Let's try again. \n");
            }
        }
    }

    private static int card3001() {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println(" If you head to the statuary, type \"statuary\" and press 'Enter'. \n" +
                    "If you head to the cemetery, type \"cemetery\" and press 'Enter'.\n" +
                    "If you head to the ditch, type \"ditch\" and press 'Enter'.\n" +
                    "If you head to the pool, type \"pool\" and press 'Enter'.");

            String choice = input.next();

            if (choice.equalsIgnoreCase("statuary")) {
                return 400;
            } else if (choice.equalsIgnoreCase("cemetery")) {
                return 2100;
            } else if (choice.equalsIgnoreCase("ditch")) {
                return 2600;
            } else if (choice.equalsIgnoreCase("pool")) {
                return 2300;
            } else {
                System.out.println(" Command not recognized. Let's try again. \n");
            }
        }
    }

    private static int card3100win() {
        System.out.println("    You made it!  You're inside the Marsden house, the edifice that has haunted your nightmares " +
                "for weeks.  Your trek through the mansion's grounds has left you with far more questions than " +
                "answers, to the point where you have to wonder if the smart move would be to turn around right " +
                "now and forget you ever came to this infernal place.\n" +
                "     You're no quitter, though.  You're an aspiring detective and psychic investigator.  You won't " +
                "give up this case until you find out why a spooky, futuristic mansion you'd never seen before has " +
                "somehow found its way into your dreams...\n" +
                "\n" +  // original text below
                " Congratulations!  You made it into the House of Danger!  " +
                "Keep in mind that there many paths, variations, and alternate--less pleasant--endings to this " +
                "experience.  Including this one, there are FIVE total endings.  If you enjoyed this game, " +
                "consider playing again to see more of what it has to offer (Can you reach all the endings?)");
        return 0;
    }

    private static void gameOver() { //original text below
        System.out.println(" It seems you've met with a terrible fate...\n" +
                "\n" +
                "Keep in mind that there are many different paths, variations, and alternate endings.  You didn't make " +
                "it into the house this time, but if you enjoyed this game, maybe give it another try?");
    }

    private static void conclusion() { //original text below
        System.out.println("Thank you for playing House of Danger REDUX.  I hope that it was an interesting experience" +
                "for you.  And please consider supporting the work that was adapted: 'Choose Your Own Adventure: House of " +
                "Danger' A Cooperative Adventure Game by Prospero Hall and published by  Z-MAN Games, Inc.  All feedback " +
                "is welcome on the House of Danger REDUX blog entry (located at: https://wordpress.com/post/sethjamesblackburn.wordpress.com/271)");
    }

    private static int dieRoll() {
        Random roller = new Random();
        int sixSideDie = 0;

        while (sixSideDie == 0) {
            sixSideDie = roller.nextInt(7);
            }

        return sixSideDie;
    }

    private static int fightingModifier(boolean sabre, boolean pocketknife) {
        if (sabre) {
            return 2;
        } else if (pocketknife) {
            return 1;
        } else {
            return 0;
        }
    }

    private static int perceptionModifier(boolean binoculars, boolean flashlight) {
        if (binoculars) {
            return 2;
        } else if (flashlight) {
            return 2;
        } else {
            return 0;
        }
    }

    private static int strengthModifier(boolean dowel, boolean shears) {
        if (dowel) {
            return 2;
        } else if (shears) {
            return 2;
        } else {
            return 0;
        }
    }

    private static void mainSwitch(){
        Stat psychic = new Stat(3);
        Stat danger = new Stat(1);
        Item pocketknife = new Item("Pocketknife");
        Item hedgeMazeMap = new Item("Hedge Maze Map");
        Item binoculars = new Item("High-Powered Binoculars");
        Item whirringMetalSphere = new Item("Whirring Metal Sphere");
        Item satelliteDish = new Item("Satellite Dish");
        Item truckKey = new Item("Truck Key");
        Item shears = new Item("Shears");
        Item largeWoodenDowel = new Item("Large Wooden Dowel");
        Item sabre = new Item("Cavalry Sabre");
        Item flashlight = new Item("Flashlight");
        // Battery, Bottle of Water, and First Aid Kit omitted from the adapted game due to differing mechanics
        // First Aid Kit effect is "built-in" to the relevant story/clue card combo
        Switch statueSwitch = new Switch(false);
        Switch challenge402 = new Switch(true);
        Switch challenge403 = new Switch(true);
        Switch lidSwitch = new Switch(false);
        Switch challenge502 = new Switch(true);
        Switch challenge503 = new Switch(true);
        Switch cigarbox = new Switch(true);
        Switch shearsInBush = new Switch(true);
        Switch lockbox = new Switch(true);
        Switch challenge2300 = new Switch(true);
        Switch challenge2600 = new Switch(true);
        Switch challenge2700 = new Switch(true);

        int mover = 100;

        while (mover != 0) {
            switch (mover) {
                case 100:
                    mover = card100();
                    pocketknife.obtainItem();
                    break;

                case 200:
                    mover = card200();
                    break;

                case 300:
                    mover = card300();
                    gameOver();
                    break;

                case 400:
                    mover = card400();
                    break;

                case 401:
                    mover = card401();
                    break;

                case 402:
                    int baseRoll402 = dieRoll();
                    int modRoll402 = baseRoll402 + perceptionModifier(binoculars.itemCheck(), flashlight.itemCheck());
                    challenge402.closeSwitch();

                    if (modRoll402 >= danger.getDangerLevel() && baseRoll402 != 1) {
                        statueSwitch.openSwitch();
                        mover = card402A(challenge403.getSwitchValue()); // succeed
                    } else {
                        danger.increaseDanger(1);
                        psychic.psyPenaltyCheck(danger.getValue());
                        danger.dangerLimit();
                        mover = card402B(challenge403.getSwitchValue()); // fail
                    }
                    break;

                case 403:
                    int roll403 = dieRoll();
                    challenge403.closeSwitch();

                    if (roll403 >= danger.getDangerLevel() && roll403 != 1) {
                        sabre.obtainItem();
                        psychic.increasePsychic(2);
                        mover = card403A(challenge402.getSwitchValue()); // succeed
                    } else {
                        danger.increaseDanger(2);
                        psychic.psyPenaltyCheck(danger.getValue());
                        danger.dangerLimit();
                        mover = card403B(challenge402.getSwitchValue()); // fail
                    }
                    break;

                case 404:
                    mover = card404(statueSwitch.getSwitchValue());
                    break;

                case 500:
                    mover = card500();
                    break;

                case 501:
                    mover = card501();
                    break;

                case 502:
                    int baseRoll502 = dieRoll();
                    int modRoll502 = baseRoll502 + perceptionModifier(binoculars.itemCheck(), flashlight.itemCheck());
                    challenge502.closeSwitch();

                    if (modRoll502 >= danger.getDangerLevel() && baseRoll502 != 1) {
                        largeWoodenDowel.obtainItem();
                        mover = card502A(challenge503.getSwitchValue()); // succeed
                    } else {
                        danger.increaseDanger(1);
                        psychic.psyPenaltyCheck(danger.getValue());
                        danger.dangerLimit();
                        mover = card502B(challenge503.getSwitchValue()); // fail
                    }
                    break;

                case 503:
                    int baseRoll503 = dieRoll();
                    int modRoll503 = baseRoll503 + strengthModifier(largeWoodenDowel.itemCheck(), shears.itemCheck());
                    challenge503.closeSwitch();

                    if (modRoll503 >= danger.getDangerLevel() && baseRoll503 != 1) {
                        lidSwitch.openSwitch();
                        mover = card503A(challenge502.getSwitchValue()); // succeed
                    } else {
                        danger.increaseDanger(2);
                        psychic.psyPenaltyCheck(danger.getValue());
                        danger.dangerLimit();
                        mover = card503B(challenge502.getSwitchValue()); // fail
                    }
                    break;

                case 504:
                    mover = card504(lidSwitch.getSwitchValue());
                    break;

                case 50024:
                    mover = card50024();
                    break;

                case 600:
                    mover = card600();
                    break;

                case 700:
                    mover = card700();
                    break;

                case 701:
                    int baseRoll701 = dieRoll();
                    int modRoll701 = baseRoll701 + fightingModifier(sabre.itemCheck(), pocketknife.itemCheck());

                    if (modRoll701 >= danger.getDangerLevel() && baseRoll701 != 1) {  // <-- This stumped me for a WHILE.  First, I kept trying to directly call the "danger" object outside of the main method.  Next, I tried using danger.getValue() WITHIN a new method.  Finally, it all came together.  And it was beautiful.
                        mover = card701A();
                        binoculars.obtainItem();
                    } else {
                        mover = card701B();
                        danger.increaseDanger(2);
                        psychic.psyPenaltyCheck(danger.getValue());
                        danger.dangerLimit();
                    }
                    break;

                case 702:
                    mover = card702();
                    break;

                case 800:
                    mover = card800();
                    break;

                case 900:
                    mover = card900(psychic.getPsychicLevel());
                    break;

                case 1000:
                    mover = card1000();
                    break;

                case 1001:
                    int roll1001 = dieRoll();
                    if (roll1001 >= danger.getDangerLevel()) {
                        mover = card1001A();
                        satelliteDish.obtainItem();
                        psychic.decreaseStat(1);
                    } else {
                        mover = card1001B();
                        danger.increaseDanger(2);
                        psychic.psyPenaltyCheck(danger.getValue());
                        danger.dangerLimit();
                    }
                    break;

                case 1100:
                    mover = card1100();
                    break;

                case 1200:
                    mover = card1200(hedgeMazeMap.itemCheck());
                    break;

                case 120001:
                    danger.increaseDanger(2);
                    psychic.psyPenaltyCheck(danger.getValue());
                    danger.dangerLimit();
                    mover = card120001();
                    break;

                case 120009:
                    mover = card120009();
                    break;

                case 120011:
                    danger.increaseDanger(2);
                    psychic.psyPenaltyCheck(danger.getValue());
                    danger.dangerLimit();
                    mover = card120011();
                    break;

                case 120012:
                    mover = card120012();
                    break;

                case 120013:
                    mover = card120013();
                    break;

                case 120014:
                    danger.increaseDanger(2);
                    psychic.psyPenaltyCheck(danger.getValue());
                    danger.dangerLimit();
                    mover = card120014();
                    break;

                case 1300:
                    mover = card1300();
                    break;

                case 1400:
                    mover = card1400(cigarbox.getSwitchValue());
                    break;

                case 1401:
                    mover = card1401();
                    flashlight.obtainItem();
                    cigarbox.closeSwitch();
                    break;

                case 1402:
                    mover = card1402();
                    break;

                case 1500:
                    mover = card1500(shearsInBush.getSwitchValue());
                    break;

                case 1501:
                    mover = card1501();
                    shears.obtainItem();
                    shearsInBush.closeSwitch();
                    break;

                case 1502:
                    mover = card1502();
                    break;

                case 1600:
                    mover = card1600();
                    gameOver();
                    break;

                case 1700:
                    mover = card1700();
                    break;

                case 1800:
                    mover = card1800(lockbox.getSwitchValue());
                    break;

                case 1801:
                    mover = card1801();
                    truckKey.obtainItem();
                    lockbox.closeSwitch();
                    psychic.increasePsychic(2);
                    break;

                case 1802:
                    mover = card1802();
                    break;

                case 1900:
                    mover = card1900();
                    break;

                case 2000:
                    mover = card2000();
                    break;

                case 2100:
                    mover = card2100();
                    break;

                case 2200:
                    mover = card2200();
                    break;

                case 220020:
                    int baseRoll220020 = dieRoll();
                    int modRoll220020 = baseRoll220020 + fightingModifier(sabre.itemCheck(), pocketknife.itemCheck());
                    while (modRoll220020 < danger.getDangerLevel() || baseRoll220020 == 1) {
                        danger.increaseDanger(4);
                        psychic.psyPenaltyCheck(danger.getValue());
                        danger.dangerLimit();
                        baseRoll220020 = dieRoll();
                        modRoll220020 = baseRoll220020 + fightingModifier(sabre.itemCheck(), pocketknife.itemCheck());
                    }
                    danger.decreaseStat(2);
                    psychic.psyPenaltyCheck(danger.getValue());
                    danger.dangerLimit();
                    mover = card220020();
                    break;

                case 2300:
                    mover = card2300(challenge2300.getSwitchValue());
                    break;

                case 2301:
                    int baseRoll2301 = dieRoll();
                    int modRoll2301 = baseRoll2301 + perceptionModifier(binoculars.itemCheck(), flashlight.itemCheck());
                    if (modRoll2301 >= danger.getDangerLevel() && baseRoll2301 != 1) {
                        whirringMetalSphere.obtainItem();
                        psychic.increasePsychic(3);
                        challenge2300.closeSwitch();
                        mover = card2302(); // succeed
                    } else {
                        danger.increaseDanger(2);
                        psychic.psyPenaltyCheck(danger.getValue());
                        danger.dangerLimit();
                        mover = card2303(); // fail
                    }
                    break;

                case 2304:
                    mover = card2304();
                    break;

                case 2400:
                    mover = card2400();
                    gameOver();
                    break;

                case 2500:
                    mover = card2500();
                    gameOver();
                    break;

                case 2600:
                    mover = card2600(challenge2600.getSwitchValue());
                    break;

                case 2601:
                    int baseRoll2601 = dieRoll();
                    int modRoll2601 = baseRoll2601 + perceptionModifier(binoculars.itemCheck(), flashlight.itemCheck());
                    challenge2600.closeSwitch();
                    if (modRoll2601 >= danger.getDangerLevel() && baseRoll2601 != 1) {
                        hedgeMazeMap.obtainItem();
                        psychic.increasePsychic(1);
                        mover = card2601A(); // succeed
                    } else {
                        danger.increaseDanger(1);
                        psychic.psyPenaltyCheck(danger.getValue());
                        danger.dangerLimit();
                        mover = card2601B(); // fail
                    }
                    break;

                case 2602:
                    mover = card2602();
                    break;

                case 2700:
                    mover = card2700(challenge2700.getSwitchValue());
                    break;

                case 2701:
                    int roll2701 = dieRoll();
                    if (roll2701 >= danger.getDangerLevel() && roll2701 != 1) {
                        danger.decreaseStat(4);
                        challenge2700.closeSwitch();
                        mover = card2701A();
                    } else {
                        danger.increaseDanger(2);
                        psychic.psyPenaltyCheck(danger.getValue());
                        danger.dangerLimit();
                        mover = card2701B();
                    }
                    break;

                case 2702:
                    mover = card2702();
                    break;

                case 2800:
                    mover = card2800();
                    break;

                case 2900:
                    mover = card2900();
                    break;

                case 3000:
                    mover = card3000();
                    break;

                case 3001:
                    danger.increaseDanger(2);
                    psychic.psyPenaltyCheck(danger.getValue());
                    danger.dangerLimit();
                    mover = card3001();
                    break;

                case 3100:
                    mover = card3100win();
                    break;
            }
        }
    }
}
