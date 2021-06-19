package virtual_pet;

public class AsciiArt {
    public static void welcomeLogo() {
        System.out.println(FontFun.YELLOW + "         _______                          " + FontFun.PURPLE + "_____  ____       _______" + FontFun.RESET + FontFun.YELLOW + "        _     _   ");
        System.out.println(FontFun.YELLOW + "        |__   __|                        " + FontFun.PURPLE + "/ ____|/ __ \\   /\\|__   __|" + FontFun.RESET + FontFun.YELLOW + "      | |   (_)  ");
        System.out.println(FontFun.YELLOW + "           | | ___  _ __ ___   __ _ ____" + FontFun.PURPLE + "| |  __| |  | | /  \\  | |" + FontFun.RESET + FontFun.YELLOW + "____  ___| |__  _   ");
        System.out.println(FontFun.YELLOW + "           | |/ _ \\| '_ ` _ \\ / _` |____" + FontFun.PURPLE + "| | |_ | |  | |/ /\\ \\ | |" + FontFun.RESET + FontFun.YELLOW + "____ / __| '_ \\| |  ");
        System.out.println(FontFun.YELLOW + "           | | (_) | | | | | | (_| |    " + FontFun.PURPLE + "| |__| | |__| / ____ \\| |" + FontFun.RESET + FontFun.YELLOW + "    | (__| | | | |  ");
        System.out.println(FontFun.YELLOW + "           |_|\\___/|_| |_| |_|\\__,_|     " + FontFun.PURPLE + "\\_____|\\____/_/    \\_\\_|" + FontFun.RESET + FontFun.YELLOW + "     \\___|_| |_|_|  " + FontFun.RESET);
    }

    public static void helpMenu() {
        manualClearScreen();
        System.out.println(FontFun.YELLOW + "====================================================================================================" + FontFun.RESET);
        System.out.println(FontFun.PURPLE + "                 _    _ ______ _      _____       __  __ ______ _   _ _    _ ");
        System.out.println("                | |  | |  ____| |    |  __ \\     |  \\/  |  ____| \\ | | |  | |");
        System.out.println("                | |__| | |__  | |    | |__) |    | \\  / | |__  |  \\| | |  | |");
        System.out.println("                |  __  |  __| | |    |  ___/     | |\\/| |  __| | . ` | |  | |");
        System.out.println("                | |  | | |____| |____| |         | |  | | |____| |\\  | |__| |");
        System.out.println("                |_|  |_|______|______|_|         |_|  |_|______|_| \\_|\\____/ " + FontFun.RESET);
        System.out.println(FontFun.YELLOW + "====================================================================================================\n\n\n\n\n" + FontFun.RESET);
    }

    public static void grimReaper() {
//        System.out.println("            *********");
//        System.out.println("           *************");
//        System.out.println("          *****     *****");
//        System.out.println("         ***           ***");
//        System.out.println("        ***             ***");
//        System.out.println("        **    " + FontFun.RED + "0     0" + FontFun.RESET + "    **");
//        System.out.println("        **               **                  ____");
//        System.out.println("        ***             ***             //////////");
//        System.out.println("        ****           ****        ///////////////  ");
//        System.out.println("        *****         *****    ///////////////////");
//        System.out.println("        ******       ******/////////         |  |");
//        System.out.println("      *********     ****//////               |  |");
//        System.out.println("   *************   **/////*****              |  |");
//        System.out.println("  *************** **///***********          *|  |*");
//        System.out.println(" ******************//******************    **| <=>*");
//        System.out.println("*********************************************|<===>* ");
//        System.out.println("*********************************************| <==>*");
//        System.out.println("***************************** ***************| <=>*");
//        System.out.println("******************************* *************|  |*");
//        System.out.println("********************************** **********|  |*  ");
//        System.out.println("*********************************** *********|  |");

        System.out.println("            *********                                                   o\"                              ");
        System.out.println("           *************                                                |\"                                 ");
        System.out.println("          *****     *****                                             ,'~'.\"                                  ");
        System.out.println("         ***           ***                                           /     \\\\\"                                   ");
        System.out.println("        ***             ***                                         |   ____|_\"                                    ");
        System.out.println("        **    " + FontFun.RED_BOLD_BRIGHT + "0     0" + FontFun.RESET + "    **                                         |  '___,,_'         .----------------.\"                                     ");
        System.out.println("        **               **                  ____                   |  ||(o |o)|       ( " + FontFun.RED_BOLD + "KILL ALL HUMANS!" + FontFun.RESET + " )\"                                                          ");
        System.out.println("        ***             ***             " + FontFun.WHITE_BOLD_BRIGHT + "//////////" + FontFun.RESET + "                  |   -------         ,----------------'\"                                                           ");
        System.out.println("        ****           ****        " + FontFun.WHITE_BOLD_BRIGHT + "///////////////" + FontFun.RESET + "                  |  _____|         -'\"                                                             ");
        System.out.println("        *****         *****    " + FontFun.WHITE_BOLD_BRIGHT + "///////////////////" + FontFun.RESET + "                  \\\\  '####,\"                                                           ");
        System.out.println("        ******       ******" + FontFun.WHITE_BOLD_BRIGHT + "/////////" + FontFun.RESET + "         |  |                    -------\"                                                          ");
        System.out.println("      *********     ****" + FontFun.WHITE_BOLD_BRIGHT + "//////" + FontFun.RESET + "               |  |                  /________\\\\\"                                                          ");
        System.out.println("   *************   **" + FontFun.WHITE_BOLD_BRIGHT + "/////" + FontFun.RESET + "*****              |  |                (  )        |)\"                                                          ");
        System.out.println("  *************** **" + FontFun.WHITE_BOLD_BRIGHT + "///" + FontFun.RESET + "***********          *|  |*               '_ ' ,------|\\\\         _\"                                                           ");
        System.out.println(" ******************" + FontFun.WHITE_BOLD_BRIGHT + "//" + FontFun.RESET + "******************    **| <=>*             /_ /  |      |_\\\\        ||\"                                                            ");
        System.out.println("*********************************************|<===>*           /_ /|  |     o| _\\\\      _||\"                                                              ");
        System.out.println("*********************************************| <==>*          /_ / |  |      |\\\\ _\\\\____//' |\"                                                             ");
        System.out.println("***************************** ***************| <=>*          (  (  |  |      | (_,_,_,____/\"                                                            ");
        System.out.println("******************************* *************|  |*            \\\\ _\\\\ |   ------|\"                                                           ");
        System.out.println("********************************** **********|  |*             \\\\ _\\\\|_________|\"                                                             ");
        System.out.println("*********************************** *********|  |               \\\\ _\\\\ \\\\__\\\\__\\\\                                                          ");
    }

    public static void portraitGoat() {
//        System.out.println("                                       ,--._,--.");
//        System.out.println("                                     ,'  ,'   ,-`.");
//        System.out.println("                          (`-.__    /  ,'   /");
//        System.out.println("                           `.   `--'        \\__,--'-.");
//        System.out.println("                             `--/       ,-.  ______/");
//        System.out.println("                               (o-.     ,o- /");
//        System.out.println("                                `. ;        \\");
//        System.out.println("                                 |:          \\");
//        System.out.println("                                ,'`       ,   \\");
//        System.out.println("                               (o o ,  --'     :");
//        System.out.println("                                \\--','.        ;");
//        System.out.println("                                 `;;  :       /");
//        System.out.println("                                  ;'  ;  ,' ,'");
//        System.out.println("                                  ,','  :  '");
//        System.out.println("                                  \\ \\   :");
//        System.out.println("                                   `");

        System.out.println("    ______________________                                                   ,--._,--.");
        System.out.println("  .'   __                 `.                                               ,'  ,'   ,-`.");
        System.out.println("  |  .'__`.    = = = =     |_.-----._                           (`-.__    /  ,'   /");
        System.out.println("  |  `.__.'    = = = =     | |     | \\ _______________           `.   `--'        \\__,--'-.");
        System.out.println("  |`.                      | |     |  |  ````````````,)           `--/       ,-.  ______/");
        System.out.println("  |  `.                    |_|     |_/~~~~~~~~~~~~~~~'               (o-.     ,o- /");
        System.out.println("  |    `-;___              | `-----'                                  `. ;        \\");
        System.out.println("  |        /\\``---..._____.'                                           |:          \\");
        System.out.println("  |       |  \\                                                        ,'`       ,   \\");
        System.out.println("  |       |   )                                                      (o o ,  --'     :");
        System.out.println("  |       |  /                                                        \\--','.        ;");
        System.out.println("  |       | /                                                          `;;  :       /");
        System.out.println("  |       `(                                                            ;'  ;  ,' ,'");
        System.out.println("  |         `.                                                          ,','  :  '");
        System.out.println("  |           )                                                         \\ \\   :");
        System.out.println("  `----------'                                                           `");
    }

    public static void grazingGoat() {
        System.out.println("                                                                                       " + FontFun.BLACK_BOLD + "____                " + FontFun.RESET);
        System.out.println("                                  ,,~~--___---,                  ,,~~--___---,    " + FontFun.BLACK_BOLD + "____|    \\              " + FontFun.RESET);
        System.out.println("                                 /            .~,               /            .~, " + FontFun.BLACK_BOLD + "(____|     `._____              " + FontFun.RESET);
        System.out.println(FontFun.BLACK_BOLD + "  _________________  " + FontFun.RESET + "        /  _,~             )           /  _,~             )  " + FontFun.BLACK_BOLD + "____|       _|___              " + FontFun.RESET);
        System.out.println(FontFun.BLACK_BOLD + " |                 | " + FontFun.RESET + "       (_-(~)   ~, ),,,(  /'          (_-(~)   ~, ),,,(  /' " + FontFun.BLACK_BOLD + "(____|     .'               " + FontFun.RESET);
        System.out.println(FontFun.BLACK_BOLD + " |     ▂▃▄▅▆█       ] " + FontFun.RESET + "        Z6  .~`' ||     \\ |           Z6  .~`' ||     \\ |       " + FontFun.BLACK_BOLD + "|____/                       " + FontFun.RESET);
        System.out.println(FontFun.BLACK_BOLD + " |_________________| " + FontFun.RESET + "         /_,/     ||      ||           /_,/     ||      ||                  ");
        System.out.println(FontFun.GREEN + "~~~~\\|/~~~~~~~~\\|/~~~~~~~\\\\|/~~~~~~~~~~" + FontFun.RESET + "W`" + FontFun.GREEN + "~~~~~~" + FontFun.RESET + "W`" + FontFun.GREEN + "~~~~~~~\\|/~~~~~~\\\\|/" + FontFun.RESET + "W`" + FontFun.GREEN + "~~~~~~" + FontFun.RESET + "W`" + FontFun.GREEN + "~~~~~~~~~~~\\\\|/~~~~~~" + FontFun.RESET);
    }

    public static void beer() {
        System.out.println("                                       " + FontFun.YELLOW + ".sssssssss.");
        System.out.println("                                  .sssssssssssssssssss");
        System.out.println("                                sssssssssssssssssssssssss");
        System.out.println("                               ssssssssssssssssssssssssssss");
        System.out.println("                               @@sssssssssssssssssssssss@ss" + FontFun.RESET);
        System.out.println("                               |" + FontFun.YELLOW + "s@@@@sssssssssssssss@@@@s" + FontFun.RESET + "|" + FontFun.YELLOW + "s" + FontFun.RESET);
        System.out.println("                        _______|" + FontFun.YELLOW + "sssss@@@@@sssss@@@@@sssss" + FontFun.RESET + "|" + FontFun.YELLOW + "s" + FontFun.RESET);
        System.out.println("                      /         " + FontFun.YELLOW + "sssssssss@sssss@sssssssss" + FontFun.RESET + "|" + FontFun.YELLOW + "s" + FontFun.RESET);
        System.out.println("                     /  .------+." + FontFun.YELLOW + "ssssssss@sssss@ssssssss" + FontFun.RESET + ".|" + FontFun.YELLOW + "" + FontFun.RESET);
        System.out.println("                    /  /       |..." + FontFun.YELLOW + "sssssss@sss@sssssss" + FontFun.RESET + "...|");
        System.out.println("                   |  |        |......." + FontFun.YELLOW + "sss@sss@ssss" + FontFun.RESET + "......|");
        System.out.println("                   |  |        |.........." + FontFun.YELLOW + "s@ss@sss" + FontFun.RESET + ".......|");
        System.out.println("                   |  |        |..........." + FontFun.YELLOW + "@ss@" + FontFun.RESET + "..........|");
        System.out.println("                    \\  \\       |............" + FontFun.YELLOW + "ss@" + FontFun.RESET + "..........|");
        System.out.println("                     \\  '------+..........." + FontFun.YELLOW + "ss@" + FontFun.RESET + "...........|");
        System.out.println("                      \\________ .........................|");
        System.out.println("                               |.........................|");
        System.out.println("                              /...........................\\");
        System.out.println("                             |.............................|");
        System.out.println("                                |.......................|");
        System.out.println("                                    |...............|");
    }

    public static void jumpingGoat() {
        System.out.println("                _))                        _))                       _))                                       ");
        System.out.println("               > *\\     _~                > *\\     _~               > *\\     _~                               ");
        System.out.println("               `;'\\\\__-' \\_               `;'\\\\__-' \\_              `;'\\\\__-' \\_                            ");
        System.out.println("                  | )  _ \\ \\                | )  _ \\ \\                | )  _ \\ \\                            ");
        System.out.println("                 / / ``   w w              / / ``   w w              / / ``   w w                             ");
        System.out.println("       " + FontFun.GREEN + "\\|/" + FontFun.RESET + "      w w               " + FontFun.GREEN + "\\|/" + FontFun.RESET + "     w w                       w w  " + FontFun.GREEN + "\\|/                       " + FontFun.RESET);
        System.out.println(FontFun.GREEN + "~\\|/~~~~~~~~~~~~~~~~~~~~~\\|/~~~~~~\\|/~~~~~~~~~~~~~~~~~~\\|/~~~~~~~~~~~~\\|/~~~~~~~~~~~" + FontFun.GREEN + "~~\\|/~~~~~~~~~~~" + FontFun.RESET);
    }

    public static void sun() {
        System.out.println(FontFun.YELLOW + "                                                   .    |     .     " + FontFun.RESET);
        System.out.println(FontFun.YELLOW + "                                                    \\   |    /      " + FontFun.RESET);
        System.out.println(FontFun.YELLOW + "                                                `.   \\  '   /   .'  " + FontFun.RESET);
        System.out.println(FontFun.YELLOW + "                                                  `. .-*\"\"*-. .'    " + FontFun.RESET);
        System.out.println(FontFun.YELLOW + "                                              \"*-._ /.*\"  \"*.\\ _.-*\"" + FontFun.RESET);
        System.out.println(FontFun.YELLOW + "                                                   :    ;     :" + FontFun.RESET);
        System.out.println(FontFun.YELLOW + "                                              \"\"\"\"':    ..    ;     " + FontFun.RESET);
        System.out.println(FontFun.YELLOW + "                                              _.-*\" \\ `.__.' / \"*-._" + FontFun.RESET);
        System.out.println(FontFun.YELLOW + "                                                  .' `-.__.-' `.    " + FontFun.RESET);
        System.out.println(FontFun.YELLOW + "                                                .'   /   .  \\   `.  " + FontFun.RESET);
        System.out.println(FontFun.YELLOW + "                                                    /    |   \\      " + FontFun.RESET);
        System.out.println(FontFun.YELLOW + "                                                   '     |    `     " + FontFun.RESET);
    }

    public static void leftGoat() {
        System.out.println("                                                                         / / 				");
        System.out.println("                                                                      (\\/_//`)				");
        System.out.println("               ____==========_______\t                              /   '/				");
        System.out.println("    _--____   |    | \"\"  \" \"|       \\                                0  0   \\ 				");
        System.out.println("   /  )8}  ^^^| 0  |  =     |  o  0  |                              /        \\				");
        System.out.println(" </_ +-==B vvv|\"\"  |  =     | '  \"\" \"|                             /    __/   \\				");
        System.out.println("    \\_____/   |____|________|________|                            /,  _/ \\     \\_               		");
        System.out.println("             (_(  )\\________/___(  )__)                           `-./ )  |     ~^~^~^~^~^~^~^~\\~.	");
        System.out.println("               |\\" + FontFun.BLACK_BOLD_BRIGHT + "I" + FontFun.RESET + " \\            /" + FontFun.BLACK_BOLD_BRIGHT + "n" + FontFun.RESET + " /\\                                 (   /                     \\_}	");
        System.out.println("               | \\" + FontFun.BLACK_BOLD_BRIGHT + "am" + FontFun.RESET + "\\          /" + FontFun.BLACK_BOLD_BRIGHT + "o" + FontFun.RESET + " /\\ \\                                   |               /      |		");
        System.out.println("               | |\\" + FontFun.BLACK_BOLD_BRIGHT + "a" + FontFun.RESET + " \\        /" + FontFun.BLACK_BOLD_BRIGHT + "t" + FontFun.RESET + "  /  \\ \\                                 ;     |         \\      /		");
        System.out.println("               (  )(" + FontFun.BLACK_BOLD_BRIGHT + "G" + FontFun.RESET + " )       (  \\   (  )                                \\/ ,/           \\    |		");
        System.out.println("                \\  /" + FontFun.BLACK_BOLD_BRIGHT + "O" + FontFun.RESET + "/        \\" + FontFun.BLACK_BOLD_BRIGHT + "an" + FontFun.RESET + "\\   \\  \\                                / /~~|~|~~~~~~|~|\\   |		");
        System.out.println("                 \\|" + FontFun.BLACK_BOLD_BRIGHT + "A" + FontFun.RESET + " |\\        \\  \\  |  |                                / /   | |      | | `\\ \\		");
        System.out.println("                  |" + FontFun.BLACK_BOLD_BRIGHT + "T" + FontFun.RESET + " | )____    \\" + FontFun.BLACK_BOLD_BRIGHT + "AT" + FontFun.RESET + "\\ \\  )___                            / /    | |      | |   \\ \\		");
        System.out.println("                  (" + FontFun.BLACK_BOLD_BRIGHT + "!!" + FontFun.RESET + ")  /  /    (" + FontFun.BLACK_BOLD_BRIGHT + "AT" + FontFun.RESET + ")  (/  /                            / (     | |      | |    \\ \\	");
        System.out.println("                 /___\\ /__/     /___\\ /__/                            /,_)    /__)     /__)   /,_/	");
        System.out.println(FontFun.GREEN + "~~~~~~~~~~~~~~~~~~~~~~~\\|/~~~~~~~~~~~~~~~\\|/~~~~~~~~~~~~\\|/~~~~~~~~~~~~~~~~~\\|/~~~~~~~~~~~\\|/~~~~~~~" + FontFun.RESET);
    }

    public static void penPoo() {
        System.out.println(FontFun.BLACK_BOLD + "                       ><                                     ><                        " + FontFun.RESET);
        System.out.println(FontFun.BLACK_BOLD + "                                                                                        ");
        System.out.println(FontFun.BLACK_BOLD + "                   ><                                     ><                            " + FontFun.RESET);
        System.out.println(FontFun.BLACK_BOLD + "               ><        ><                           ><        ><                      " + FontFun.RESET);
        System.out.println(FontFun.BLACK_BOLD + "                      ><" + FontFun.RESET + "              (   )                  " + FontFun.BLACK_BOLD + ">< " + FontFun.RESET + "             (   )      ");
        System.out.println("                  (`\\              (   ) (               (`\\              (   ) (       ");
        System.out.println("                  _> )_             ) _   )              _> )_             ) _   )      ");
        System.out.println("               ,-' ,-. `;            ( \\_             ,-' ,-. `;            ( \\_        ");
        System.out.println("               `\"\"/  /\"\"           _(_\\ \\)__          `\"\"/  /\"\"           _(_\\ \\)__     ");
        System.out.println("                  `-\"             (____\\___))            `-\"             (____\\___))    ");
        System.out.println(FontFun.GREEN + "~~~~~~~~~~~~~~~~~~~~~~~\\|/~~~~~~~~~~~~~~~\\|/~~~~~~~~~~~~\\|/~~~~~~~~~~~~~~~~~\\|/~~~~~~~~~~~\\|/~~~~~~~" + FontFun.RESET);
    }

    public static void screw() {
        System.out.println(FontFun.BLACK_BOLD_BRIGHT + "      ,==\"\"\"\"\"\"\"==,            ,==\"\"\"\"\"\"\"==,            ,==\"\"\"\"\"\"\"==,            ,==\"\"\"\"\"\"\"==,         ");
        System.out.println("       '=._   _.='              '=._   _.='              '=._   _.='              '=._   _.='          ");
        System.out.println("          ('.|                     ('.|                     ('.|                     ('.|              ");
        System.out.println("           |._)                     |._)                     |._)                     |._)             ");
        System.out.println("          ('.|                     ('.|                     ('.|                     ('.|              ");
        System.out.println("           |._)                     |._)                     |._)                     |._)             ");
        System.out.println("          ('.|                     ('.|                     ('.|                     ('.|              ");
        System.out.println("           |._)                     |._)                     |._)                     |._)             ");
        System.out.println("          ('.|                     ('.|                     ('.|                     ('.|              ");
        System.out.println("           |._)                     |._)                     |._)                     |._)             ");
        System.out.println("          ('.|                     ('.|                     ('.|                     ('.|             ");
        System.out.println("           |._)                     |._)                     |._)                     |._)             ");
        System.out.println("          ('.|                     ('.|                     ('.|                     ('.|             ");
        System.out.println("           |._)                     |._)                     |._)                     |._)             ");
        System.out.println("          ('.|                     ('.|                     ('.|                     ('.|             ");
        System.out.println("           |._)                     |._)                     |._)                     |._)             ");
        System.out.println("          ('.|                     ('.|                     ('.|                     ('.|             ");
        System.out.println("           |._)                     |._)                     |._)                     |._)             ");
        System.out.println("           \\_/                      \\_/                      \\_/                      \\_/             "+FontFun.RESET);
    }

    public static void manualClearScreen() {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }

    public static void sectionBreakGreen() {
        System.out.println(FontFun.GREEN + "====================================================================================================" + FontFun.RESET);
    }

    public static void fireWorks() {
        System.out.println("                                                       .''.");
        System.out.println("                             .''.             *''*    :_\\/_:     . ");
        System.out.println("                            :_\\/_:   .    .:.*_\\/_*   : /\\ :  .'.:.'.");
        System.out.println("                        .''.: /\\ : _\\(/_  ':'* /\\ *  : '..'.  -=:o:=-");
        System.out.println("                       :_\\/_:'.:::. /)\\*''*  .|.* '.\'/.'_\\(/_'.':'.'");
        System.out.println("                       : /\\ : :::::  '*_\\/_* | |  -= o =- /)\\    '  *");
        System.out.println("                        '..'  ':::'   * /\\ * |'|  .'/.\'.  '._____");
        System.out.println("                            *        __*..* |  |     :      |.   |' .---\"|");
        System.out.println("                             _*   .-'   '-. |  |     .--'|  ||   | _|    |");
        System.out.println("                          .-'|  _.|  |    ||   '-__  |   |  |    ||      |");
        System.out.println("                          |' | |.    |    ||       | |   |  |    ||      |");
        System.out.println("                       ___|  '-'     '    \"\"       '-'   '-.'    '`      |____");
    }

    public static void benderPEATGoodbye() {
        System.out.println("            o");
        System.out.println("            |");
        System.out.println("          ,'~'.");
        System.out.println("         /     \\");
        System.out.println("        |   ____|_");
        System.out.println("        |  '___,,_'         .----------------.");
        System.out.println("        |  ||(o |o)|       ( KILL ALL HUMANS! )");
        System.out.println("        |   -------         ,----------------'");
        System.out.println("        |  _____|         -'");
        System.out.println("        \\  '####,");
        System.out.println("         -------");
        System.out.println("       /________\\");
        System.out.println("     (  )        |)");
        System.out.println("     '_ ' ,------|\\         _");
        System.out.println("    /_ /  |      |_\\        ||");
        System.out.println("   /_ /|  |     o| _\\      _||");
        System.out.println("  /_ / |  |      |\\ _\\____//' |");
        System.out.println(" (  (  |  |      | (_,_,_,____/");
        System.out.println("  \\ _\\ |   ------|");
        System.out.println("   \\ _\\|_________|");
        System.out.println("    \\ _\\ \\__\\__\\");
        System.out.println("    |__| |__||__|");
        System.out.println(" ||/__/  |__||__|");
        System.out.println("         |__||__|");
        System.out.println("         |__||__|");
        System.out.println("         /__)/__)");
        System.out.println("        /__//__/");
        System.out.println("       /__//__/");
        System.out.println("      /__//__/.");
        System.out.println("    .'    '.   '.");
        System.out.println("   (________)____)");
    }

    public static void littleGoat() {
        System.out.println("                                    ░░░░          ░░░░                                  ");
        System.out.println("                                    ░░░░          ░░░░                                  ");
        System.out.println("                                    ░░░░░░      ░░░░░░                                  ");
        System.out.println("                                    ░░░░░░░░░░░░░░░░░░                                  ");
        System.out.println("                              ▒▒▒▒▒▒▒▒░░░░░░░░░░░░░░▒▒▒▒▒▒▒▒                            ");
        System.out.println("                            ▒▒▒▒▒▒▒▒░░░░░░░░░░░░░░░░░░▒▒▒▒▒▒▒▒                          ");
        System.out.println("                            ▒▒▒▒▒▒▒▒░░░░░░░░░░░░░░░░░░▒▒▒▒▒▒▒▒                          ");
        System.out.println("                              ▒▒▒▒  ░░░░░░░░░░░░░░░░░░  ▒▒▒▒                            ");
        System.out.println("                                  ░░░░██░░░░░░░░░░██░░░░                                ");
        System.out.println("                                  ░░░░░░░░░░░░░░░░░░░░░░                                ");
        System.out.println("                                  ░░░░░░░░░░░░░░░░░░░░░░                                ");
        System.out.println("                                  ▒▒░░░░░░░░░░░░░░░░░░▒▒                                ");
        System.out.println("                                  ▒▒▒▒░░░░░░░░░░░░░░▒▒▒▒                                ");
        System.out.println("                                  ▒▒▒▒▒▒▒▒░░░░░░▒▒▒▒▒▒▒▒                                ");
        System.out.println("                                  ▒▒▒▒▒▒▒▒░░░░░░▒▒▒▒▒▒▒▒                                ");
        System.out.println("                                    ▒▒▒▒▒▒▒▒░░▒▒▒▒▒▒▒▒                                  ");
        System.out.println("                                    ░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░                                  ");
        System.out.println("                                    ░░░░▒▒▒▒▒▒▒▒▒▒░░░░                                  ");
        System.out.println("                                    ████          ████                                  ");
    }

    public static void horns() {
        System.out.println("      ████████                    ████████      ");
        System.out.println("    ██▓▓▓▓▓▓▓▓██                ██▓▓▓▓▓▓▓▓██    ");
        System.out.println("  ██▓▓▓▓▓▓▓▓▓▓▓▓██            ██▓▓▓▓▓▓▓▓▓▓▓▓██  ");
        System.out.println("██▓▓▓▓▓▓████▓▓▓▓▓▓██        ██▓▓▓▓▓▓████▓▓▓▓▓▓██");
        System.out.println("██▓▓▓▓██    ██▓▓▓▓▓▓██    ██▓▓▓▓▓▓██    ██▓▓▓▓██");
        System.out.println("██▓▓██        ██▓▓▓▓▓▓████▓▓▓▓▓▓██        ██▓▓██");
        System.out.println("  ██          ██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██          ██  ");
        System.out.println("        ██████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒████████      ");
        System.out.println("      ██▒▒▒▒▒▒▒▒  ▒▒  ▒▒▒▒  ▒▒  ▒▒▒▒▒▒▒▒▒▒██    ");
        System.out.println("    ██▒▒▒▒▒▒▒▒▒▒  ▒▒  ▒▒▒▒  ▒▒  ▒▒▒▒▒▒▒▒▒▒██    ");
        System.out.println("    ██▒▒▒▒██▒▒▒▒  ▒▒  ▒▒▒▒  ▒▒  ▒▒▒▒██▒▒▒▒██    ");
        System.out.println("      ██████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██████      ");
        System.out.println("          ██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██          ");
        System.out.println("            ██▒▒▒▒▒▒██▒▒▒▒██▒▒▒▒▒▒██            ");
        System.out.println("              ██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██              ");
        System.out.println("                ██▒▒▒▒▓▓▓▓▒▒▒▒██                ");
        System.out.println("                ██▓▓▓▓▓▓▓▓▓▓▓▓██                ");
        System.out.println("                  ██▓▓▓▓▓▓▓▓██                  ");
        System.out.println("                  ██▓▓▓▓▓▓▓▓██                  ");
        System.out.println("                    ██▓▓▓▓██                    ");
        System.out.println("                    ██▓▓▓▓██                    ");
        System.out.println("                      ████                      ");
    }

    public static void deadFaintGoat() {
        System.out.println("        ___");
        System.out.println("        \\_/_" + FontFun.GREEN + "         ___..._____....__\\|/_" + FontFun.RESET);
        System.out.println("       / /_/" + FontFun.GREEN + "__..---\"\"" + FontFun.RESET + "___   ___ .    .  .  " + FontFun.GREEN + "\"\"\"---...___" + FontFun.RESET);
        System.out.println("" + FontFun.GREEN + "" + FontFun.GREEN + "__..--" + FontFun.RESET + "" + FontFun.RESET + "/ ( (       .  \\_/   \\_/            " + FontFun.GREEN + "\\|/" + FontFun.RESET + "    .   .");
        System.out.println("     /  | |   " + FontFun.GREEN + "\\|/" + FontFun.RESET + "     \\ \\  \\ \\     " + FontFun.GREEN + "\\|/" + FontFun.RESET + "");
        System.out.println("" + FontFun.GREEN + "\\|/" + FontFun.RESET + " |  <  <  .     .   \\ \\  \\ \\   .        .        .");
        System.out.println("    \\   \\_ \\            \\ \\ |  \\");
        System.out.println(" .   \\    `-.___    _.../__/   |   .   .      " + FontFun.GREEN + "\\|/" + FontFun.RESET + "  .");
        System.out.println("     /          `~~~      /   /");
        System.out.println("    |                   (    /");
        System.out.println("    |                  /     \\   .     .   " + FontFun.GREEN + "\\|/" + FontFun.RESET + "");
        System.out.println("   /                          \\");
        System.out.println(" .'                            \\  .-\"\"\"-.");
        System.out.println("(_.'~`----`~~~~~`-._            ,`     \\o)    .       .");
        System.out.println("    .       .       `-._         _      /");
        System.out.println("                        `-.     ( `-_X./         ");
        System.out.println("           " + FontFun.GREEN + "\\|/" + FontFun.RESET + "             `-.   `-._)/");
        System.out.println("                 .       .    `-.__.-'     .      .");
        System.out.println("                                " + FontFun.GREEN + "\\|/" + FontFun.RESET + "");
//        System.out.println(" .            .                       .");
        System.out.println("     " + FontFun.GREEN + "\\|/" + FontFun.RESET + "           .    " + FontFun.GREEN + "\\|/" + FontFun.RESET + "      .         " + FontFun.GREEN + "\\|/" + FontFun.RESET + "    .");
    }

    public static void countingSheep() {
        System.out.println("     _       _       _       _       _       _       _       _");
        System.out.println("  _-(_)-  _-(_)-  _-(_)-  _-(_)-  _-(_)-  _-(_)-  _-(_)-  _-(_)-");
        System.out.println("`(___)  `(___)  `(___)  `(___)  `(___)  `(___)  `(___)  `(___)");
        System.out.println(" // \\\\   // \\\\   // \\\\   // \\\\   // \\\\   // \\\\   // \\\\   // \\\\");
        System.out.println("                           __  _");
        System.out.println("                       .-.'  `; `-._  __  _");
        System.out.println("                      (_,         .-:'  `; `-._");
        System.out.println("                    ,'o\"(        (_,           )");
        System.out.println("                   (__,-'      ,'o\"(            )>");
        System.out.println("                      (       (__,-'            )");
        System.out.println("                       `-'._.--._(             )");
        System.out.println("                          |||  |||`-'._.--._.-'");
        System.out.println("                                     |||  |||");
        System.out.println("      _       _       _       _       _       _       _       _");
        System.out.println("   _-(_)-  _-(_)-  _-(_)-  _-(_)-  _-(_)-  _-(_)-  _-(_)-  _-(_)-");
        System.out.println(" `(___)  `(___)  `(___)  `(___)  `(___)  `(___)  `(___)  `(___)");
        System.out.println("  // \\\\   // \\\\   // \\\\   // \\\\   // \\\\   // \\\\   // \\\\   // \\\\");
    }

    public static void easterEggFortyTwo() {
        System.out.println(" .    .              +   .          ..    .   . .     .  .");
        System.out.println("                       .                    .       .     *");
        System.out.println(" +    .       *                        . . . .  .   .  + .");
        System.out.println("                " + FontFun.BLUE + "\"You Are Here\"" + FontFun.RESET + "            .   .  +  . . .");
        System.out.println("    .                  " + FontFun.BLUE + "|" + FontFun.RESET + "             .  .   .    .    . .");
        System.out.println("         .             " + FontFun.BLUE + "|" + FontFun.RESET + "           .     .     . +.    +  .");
        System.out.println(" *     .              " + FontFun.BLUE + "\\|/" + FontFun.RESET + "            .       .   . .");
        System.out.println("      .     . .        " + FontFun.BLUE + "V" + FontFun.RESET + "          .    * . . .  .  +   .");
        System.out.println("        +              " + FontFun.BLUE + "." + FontFun.RESET + "           .   .      +");
        System.out.println(".                               .       . +  .+. .");
        System.out.println("      .                      .     . + .  . .     .      .");
        System.out.println("*              .      .    .     . .   . . .        " + FontFun.YELLOW + "! /" + FontFun.RESET);
        System.out.println(" ..       *             .    . .  +    .  .       " + FontFun.YELLOW + "- O -" + FontFun.RESET);
        System.out.println("              .     .    .  +   . .  *  .       . " + FontFun.YELLOW + "/ |" + FontFun.RESET);
        System.out.println("   .               . + .  .  .  .. +  .");
        System.out.println(".+  .      .  .  .  *   .  *  . +..  .            *");
        System.out.println("  .   .      .   . .   .   .   . .  +   .    .            +");
        System.out.println("While 42 is the Answer to the Ultimate Question of Life, the Universe, and Everything,");
        System.out.println("It is " + FontFun.WHITE_UNDERLINED + FontFun.WHITE_BOLD + "NOT" + FontFun.RESET + " an option in this game! Please enter your selection to try again.");
        System.out.println("Or enter zero for help.");
    }

    public static void goatMan() {
        System.out.println("                       /)  (\\                       ");
        System.out.println("                  )\\.:::::::::./(                   ");
        System.out.println("                  \\( o       o )/                   ");
        System.out.println("                    '-./ / _.-'`-.                   ");
        System.out.println("                     ( oo  ) / _  \\                 ");
        System.out.println("                     |'--'/\\/ ( \\  \\              ");
        System.out.println("                      \\''/  \\|\\ \\  \\            ");
        System.out.println("                       ww   |  '  )  \\              ");
        System.out.println("                            |.' .'   |               ");
        System.out.println("                           .' .'==|==|               ");
        System.out.println("                          / .'\\    [_]              ");
        System.out.println("                       .-(/\\) |     /               ");
        System.out.println("                      /.-\"\"\" '/|    |             ");
        System.out.println("                      ||    / |    |                 ");
        System.out.println("                      //   |  |    |                 ");
        System.out.println("                      ||   |__|___/                  ");
        System.out.println("                      \\   [__[___]                  ");
        System.out.println("                      // .-'.-'  (                   ");
        System.out.println("                      ||(__(__.-._)                  ");
        System.out.println(FontFun.GREEN + "~~~~~~~~~~~~~~~~~~~~~~~\\|/~~~~~~~~~~~~~~~\\|/~~~~~" + FontFun.RESET);
    }

}
