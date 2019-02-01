/*
 * Copyright (c) 2018. by 10bashi - I just started learning programming. So please forgive for my mistakes!
 */

package advent.of.code.day1;

public class Frequency {
    private static int frequency = 0;
    private static String input = "-14\n" +
            "+15\n" +
            "+9\n" +
            "+19\n" +
            "+18\n" +
            "+14\n" +
            "+14\n" +
            "-18\n" +
            "+15\n" +
            "+4\n" +
            "-18\n" +
            "-20\n" +
            "-2\n" +
            "+17\n" +
            "+16\n" +
            "-7\n" +
            "-3\n" +
            "+5\n" +
            "+1\n" +
            "-5\n" +
            "-11\n" +
            "-1\n" +
            "-6\n" +
            "-20\n" +
            "+1\n" +
            "+1\n" +
            "+4\n" +
            "+18\n" +
            "+5\n" +
            "-20\n" +
            "-10\n" +
            "+18\n" +
            "+5\n" +
            "-4\n" +
            "-5\n" +
            "-18\n" +
            "+9\n" +
            "+6\n" +
            "+1\n" +
            "-19\n" +
            "+13\n" +
            "+10\n" +
            "-22\n" +
            "-11\n" +
            "-14\n" +
            "-17\n" +
            "-10\n" +
            "-1\n" +
            "-13\n" +
            "+6\n" +
            "-17\n" +
            "+9\n" +
            "-11\n" +
            "-6\n" +
            "+3\n" +
            "-14\n" +
            "+4\n" +
            "-14\n" +
            "+15\n" +
            "+7\n" +
            "+15\n" +
            "-1\n" +
            "-4\n" +
            "+9\n" +
            "+10\n" +
            "+6\n" +
            "-9\n" +
            "+8\n" +
            "+3\n" +
            "+10\n" +
            "-14\n" +
            "+8\n" +
            "+22\n" +
            "+19\n" +
            "-15\n" +
            "+10\n" +
            "-6\n" +
            "+9\n" +
            "-4\n" +
            "+2\n" +
            "+11\n" +
            "-15\n" +
            "+14\n" +
            "+11\n" +
            "-14\n" +
            "+2\n" +
            "+7\n" +
            "+9\n" +
            "-22\n" +
            "-6\n" +
            "-3\n" +
            "-21\n" +
            "+10\n" +
            "+5\n" +
            "-20\n" +
            "+19\n" +
            "-3\n" +
            "-13\n" +
            "+5\n" +
            "-16\n" +
            "+12\n" +
            "+10\n" +
            "-12\n" +
            "-4\n" +
            "+12\n" +
            "+2\n" +
            "-1\n" +
            "-4\n" +
            "-8\n" +
            "-6\n" +
            "-3\n" +
            "-8\n" +
            "-8\n" +
            "+7\n" +
            "-10\n" +
            "-20\n" +
            "-12\n" +
            "-6\n" +
            "-17\n" +
            "+2\n" +
            "+20\n" +
            "+7\n" +
            "-17\n" +
            "-14\n" +
            "-8\n" +
            "+3\n" +
            "+11\n" +
            "+15\n" +
            "-4\n" +
            "-10\n" +
            "-16\n" +
            "-3\n" +
            "-19\n" +
            "-6\n" +
            "-3\n" +
            "-9\n" +
            "-16\n" +
            "-7\n" +
            "-16\n" +
            "-12\n" +
            "+11\n" +
            "-13\n" +
            "-6\n" +
            "+13\n" +
            "+4\n" +
            "-7\n" +
            "-3\n" +
            "+5\n" +
            "+12\n" +
            "+4\n" +
            "-19\n" +
            "-19\n" +
            "+7\n" +
            "+1\n" +
            "-7\n" +
            "-12\n" +
            "-7\n" +
            "-5\n" +
            "-17\n" +
            "+18\n" +
            "+3\n" +
            "+10\n" +
            "+15\n" +
            "-12\n" +
            "-8\n" +
            "+17\n" +
            "+9\n" +
            "+19\n" +
            "+4\n" +
            "+16\n" +
            "-11\n" +
            "+10\n" +
            "-6\n" +
            "-7\n" +
            "+6\n" +
            "+6\n" +
            "+19\n" +
            "+3\n" +
            "+8\n" +
            "-2\n" +
            "+12\n" +
            "+19\n" +
            "-17\n" +
            "+7\n" +
            "-2\n" +
            "-10\n" +
            "-16\n" +
            "-11\n" +
            "-1\n" +
            "-2\n" +
            "-17\n" +
            "-7\n" +
            "+22\n" +
            "+3\n" +
            "+8\n" +
            "+11\n" +
            "-12\n" +
            "-4\n" +
            "+3\n" +
            "+19\n" +
            "-16\n" +
            "+18\n" +
            "-12\n" +
            "-17\n" +
            "-8\n" +
            "+5\n" +
            "-11\n" +
            "+7\n" +
            "-12\n" +
            "-23\n" +
            "-2\n" +
            "+14\n" +
            "+8\n" +
            "+9\n" +
            "+3\n" +
            "+29\n" +
            "+16\n" +
            "-15\n" +
            "-2\n" +
            "-12\n" +
            "+24\n" +
            "+14\n" +
            "+2\n" +
            "+4\n" +
            "-2\n" +
            "+18\n" +
            "-9\n" +
            "-18\n" +
            "+8\n" +
            "-9\n" +
            "+4\n" +
            "+7\n" +
            "+19\n" +
            "+7\n" +
            "+10\n" +
            "-9\n" +
            "-14\n" +
            "-6\n" +
            "+5\n" +
            "+17\n" +
            "-14\n" +
            "+7\n" +
            "+2\n" +
            "-1\n" +
            "+11\n" +
            "+18\n" +
            "-2\n" +
            "-6\n" +
            "+19\n" +
            "-15\n" +
            "-18\n" +
            "-5\n" +
            "+12\n" +
            "+21\n" +
            "+2\n" +
            "+2\n" +
            "-5\n" +
            "+10\n" +
            "+8\n" +
            "-10\n" +
            "+1\n" +
            "-17\n" +
            "+6\n" +
            "+21\n" +
            "+18\n" +
            "-17\n" +
            "+7\n" +
            "-5\n" +
            "+43\n" +
            "-4\n" +
            "+50\n" +
            "-4\n" +
            "+9\n" +
            "+16\n" +
            "-12\n" +
            "+9\n" +
            "+10\n" +
            "-21\n" +
            "+3\n" +
            "+25\n" +
            "-9\n" +
            "+18\n" +
            "+17\n" +
            "-19\n" +
            "+5\n" +
            "+16\n" +
            "-8\n" +
            "-17\n" +
            "+16\n" +
            "+21\n" +
            "-16\n" +
            "+6\n" +
            "+12\n" +
            "-9\n" +
            "+19\n" +
            "-7\n" +
            "+4\n" +
            "-8\n" +
            "+7\n" +
            "+18\n" +
            "+17\n" +
            "-7\n" +
            "+11\n" +
            "+21\n" +
            "-6\n" +
            "+4\n" +
            "-17\n" +
            "-19\n" +
            "+18\n" +
            "+13\n" +
            "-17\n" +
            "+2\n" +
            "+4\n" +
            "-8\n" +
            "+9\n" +
            "+22\n" +
            "+2\n" +
            "+5\n" +
            "+13\n" +
            "+6\n" +
            "+3\n" +
            "-28\n" +
            "-17\n" +
            "-17\n" +
            "-6\n" +
            "+19\n" +
            "-16\n" +
            "-19\n" +
            "+11\n" +
            "-7\n" +
            "+6\n" +
            "-17\n" +
            "+3\n" +
            "-4\n" +
            "-7\n" +
            "-6\n" +
            "+10\n" +
            "+17\n" +
            "-7\n" +
            "-4\n" +
            "+2\n" +
            "+8\n" +
            "-7\n" +
            "-25\n" +
            "+15\n" +
            "-10\n" +
            "-18\n" +
            "-10\n" +
            "-10\n" +
            "-11\n" +
            "-11\n" +
            "+14\n" +
            "+14\n" +
            "-3\n" +
            "+21\n" +
            "+10\n" +
            "-11\n" +
            "+6\n" +
            "+11\n" +
            "+21\n" +
            "-25\n" +
            "-9\n" +
            "-14\n" +
            "+2\n" +
            "+16\n" +
            "-27\n" +
            "+4\n" +
            "-7\n" +
            "+6\n" +
            "-11\n" +
            "+29\n" +
            "+21\n" +
            "+21\n" +
            "+6\n" +
            "-10\n" +
            "+14\n" +
            "+17\n" +
            "+6\n" +
            "-13\n" +
            "+32\n" +
            "-23\n" +
            "+17\n" +
            "-1\n" +
            "+12\n" +
            "-6\n" +
            "-11\n" +
            "+27\n" +
            "-5\n" +
            "+19\n" +
            "-2\n" +
            "-21\n" +
            "-42\n" +
            "-21\n" +
            "+19\n" +
            "-64\n" +
            "+20\n" +
            "-38\n" +
            "+42\n" +
            "-23\n" +
            "+1\n" +
            "-29\n" +
            "+26\n" +
            "-4\n" +
            "+57\n" +
            "+6\n" +
            "-1\n" +
            "+31\n" +
            "+107\n" +
            "-9\n" +
            "+5\n" +
            "+19\n" +
            "-12\n" +
            "+20\n" +
            "-1\n" +
            "+30\n" +
            "+1\n" +
            "+2\n" +
            "-47\n" +
            "-38\n" +
            "+5\n" +
            "+13\n" +
            "+121\n" +
            "+69\n" +
            "-60\n" +
            "+57143\n" +
            "-13\n" +
            "-3\n" +
            "+13\n" +
            "+15\n" +
            "+1\n" +
            "-19\n" +
            "-11\n" +
            "+2\n" +
            "-14\n" +
            "+4\n" +
            "+15\n" +
            "+8\n" +
            "-7\n" +
            "+16\n" +
            "+3\n" +
            "-5\n" +
            "-16\n" +
            "+17\n" +
            "-18\n" +
            "+5\n" +
            "-7\n" +
            "+17\n" +
            "+11\n" +
            "+12\n" +
            "-2\n" +
            "+16\n" +
            "-17\n" +
            "+6\n" +
            "+12\n" +
            "-9\n" +
            "-16\n" +
            "-5\n" +
            "+9\n" +
            "+18\n" +
            "+15\n" +
            "-19\n" +
            "+16\n" +
            "+16\n" +
            "-9\n" +
            "+5\n" +
            "-18\n" +
            "+19\n" +
            "-17\n" +
            "-18\n" +
            "+9\n" +
            "+11\n" +
            "+7\n" +
            "-3\n" +
            "-7\n" +
            "-6\n" +
            "+3\n" +
            "-17\n" +
            "-4\n" +
            "+6\n" +
            "+4\n" +
            "+2\n" +
            "+10\n" +
            "-13\n" +
            "-21\n" +
            "+10\n" +
            "-17\n" +
            "+15\n" +
            "+1\n" +
            "-10\n" +
            "-13\n" +
            "+20\n" +
            "-14\n" +
            "+21\n" +
            "+13\n" +
            "+16\n" +
            "+5\n" +
            "+4\n" +
            "+19\n" +
            "+9\n" +
            "+12\n" +
            "+4\n" +
            "-10\n" +
            "+14\n" +
            "-6\n" +
            "+17\n" +
            "-9\n" +
            "-14\n" +
            "+3\n" +
            "+16\n" +
            "+6\n" +
            "+13\n" +
            "+6\n" +
            "-15\n" +
            "+14\n" +
            "+11\n" +
            "-1\n" +
            "+8\n" +
            "-4\n" +
            "+11\n" +
            "+5\n" +
            "-7\n" +
            "-19\n" +
            "-2\n" +
            "+14\n" +
            "+18\n" +
            "-14\n" +
            "+2\n" +
            "+18\n" +
            "+16\n" +
            "-3\n" +
            "+16\n" +
            "+7\n" +
            "+1\n" +
            "-12\n" +
            "-5\n" +
            "-18\n" +
            "+8\n" +
            "+11\n" +
            "-7\n" +
            "-8\n" +
            "-19\n" +
            "+14\n" +
            "-10\n" +
            "-7\n" +
            "+4\n" +
            "+9\n" +
            "-18\n" +
            "-2\n" +
            "+19\n" +
            "+21\n" +
            "+9\n" +
            "+1\n" +
            "-9\n" +
            "+4\n" +
            "-3\n" +
            "+4\n" +
            "-11\n" +
            "-17\n" +
            "+10\n" +
            "-2\n" +
            "+6\n" +
            "-20\n" +
            "+3\n" +
            "+15\n" +
            "+4\n" +
            "+19\n" +
            "+19\n" +
            "-14\n" +
            "+3\n" +
            "+1\n" +
            "+4\n" +
            "+12\n" +
            "+11\n" +
            "-8\n" +
            "+12\n" +
            "+18\n" +
            "-14\n" +
            "+2\n" +
            "-4\n" +
            "+19\n" +
            "-1\n" +
            "+4\n" +
            "+15\n" +
            "+13\n" +
            "+16\n" +
            "+7\n" +
            "-12\n" +
            "+10\n" +
            "-13\n" +
            "-3\n" +
            "-17\n" +
            "+19\n" +
            "-16\n" +
            "+5\n" +
            "-20\n" +
            "-15\n" +
            "+3\n" +
            "+18\n" +
            "+4\n" +
            "+3\n" +
            "+3\n" +
            "+14\n" +
            "-12\n" +
            "+8\n" +
            "+11\n" +
            "+7\n" +
            "+10\n" +
            "+13\n" +
            "-7\n" +
            "+5\n" +
            "-19\n" +
            "+12\n" +
            "-3\n" +
            "+18\n" +
            "-9\n" +
            "+7\n" +
            "+1\n" +
            "+18\n" +
            "+17\n" +
            "-6\n" +
            "+1\n" +
            "-15\n" +
            "+10\n" +
            "-5\n" +
            "-10\n" +
            "-6\n" +
            "+18\n" +
            "+16\n" +
            "+6\n" +
            "+5\n" +
            "-10\n" +
            "-8\n" +
            "-5\n" +
            "+7\n" +
            "-1\n" +
            "-4\n" +
            "+17\n" +
            "+1\n" +
            "+4\n" +
            "-8\n" +
            "+1\n" +
            "+11\n" +
            "-13\n" +
            "-18\n" +
            "-14\n" +
            "+5\n" +
            "+3\n" +
            "+19\n" +
            "+12\n" +
            "+8\n" +
            "-3\n" +
            "+5\n" +
            "-24\n" +
            "+3\n" +
            "-10\n" +
            "-20\n" +
            "-1\n" +
            "+10\n" +
            "-19\n" +
            "+6\n" +
            "+8\n" +
            "-3\n" +
            "-10\n" +
            "+15\n" +
            "-8\n" +
            "+14\n" +
            "-17\n" +
            "-17\n" +
            "+4\n" +
            "+1\n" +
            "-12\n" +
            "+13\n" +
            "-11\n" +
            "+4\n" +
            "+12\n" +
            "-25\n" +
            "-1\n" +
            "-8\n" +
            "+14\n" +
            "-23\n" +
            "-21\n" +
            "+17\n" +
            "-20\n" +
            "+2\n" +
            "-5\n" +
            "-1\n" +
            "+12\n" +
            "-10\n" +
            "+3\n" +
            "+17\n" +
            "+4\n" +
            "-15\n" +
            "+20\n" +
            "-1\n" +
            "+9\n" +
            "+23\n" +
            "-20\n" +
            "-22\n" +
            "-12\n" +
            "-10\n" +
            "-15\n" +
            "+11\n" +
            "-35\n" +
            "-12\n" +
            "-14\n" +
            "+16\n" +
            "-10\n" +
            "-19\n" +
            "+26\n" +
            "+12\n" +
            "+16\n" +
            "-8\n" +
            "-15\n" +
            "+19\n" +
            "+3\n" +
            "-12\n" +
            "-16\n" +
            "+10\n" +
            "+2\n" +
            "-1\n" +
            "+13\n" +
            "-7\n" +
            "+2\n" +
            "+12\n" +
            "+9\n" +
            "-1\n" +
            "+2\n" +
            "-21\n" +
            "+3\n" +
            "-1\n" +
            "+13\n" +
            "+7\n" +
            "+2\n" +
            "+3\n" +
            "+18\n" +
            "-32\n" +
            "+4\n" +
            "+43\n" +
            "+19\n" +
            "-3\n" +
            "-5\n" +
            "+20\n" +
            "-2\n" +
            "-2\n" +
            "+17\n" +
            "+61\n" +
            "+2\n" +
            "-5\n" +
            "+23\n" +
            "-3\n" +
            "+8\n" +
            "-12\n" +
            "+55\n" +
            "+12\n" +
            "+12\n" +
            "+6\n" +
            "+20\n" +
            "-6\n" +
            "+7\n" +
            "+15\n" +
            "+3\n" +
            "+11\n" +
            "+8\n" +
            "-4\n" +
            "-9\n" +
            "-19\n" +
            "-13\n" +
            "-4\n" +
            "+6\n" +
            "-10\n" +
            "-9\n" +
            "-5\n" +
            "-4\n" +
            "+11\n" +
            "+5\n" +
            "+15\n" +
            "-14\n" +
            "+2\n" +
            "+6\n" +
            "-22\n" +
            "+2\n" +
            "+18\n" +
            "-11\n" +
            "-2\n" +
            "-4\n" +
            "-16\n" +
            "-5\n" +
            "+12\n" +
            "+4\n" +
            "+20\n" +
            "+8\n" +
            "+18\n" +
            "-6\n" +
            "+15\n" +
            "+17\n" +
            "-11\n" +
            "+16\n" +
            "-13\n" +
            "-12\n" +
            "+1\n" +
            "-9\n" +
            "+3\n" +
            "+16\n" +
            "+4\n" +
            "+19\n" +
            "+9\n" +
            "-8\n" +
            "-7\n" +
            "-12\n" +
            "+11\n" +
            "+21\n" +
            "-11\n" +
            "-16\n" +
            "+8\n" +
            "+1\n" +
            "+25\n" +
            "+15\n" +
            "-9\n" +
            "-42\n" +
            "+12\n" +
            "-18\n" +
            "-6\n" +
            "-10\n" +
            "-8\n" +
            "-5\n" +
            "-23\n" +
            "-20\n" +
            "+14\n" +
            "+12\n" +
            "+23\n" +
            "+120\n" +
            "+19\n" +
            "-43\n" +
            "+9\n" +
            "-1\n" +
            "-1\n" +
            "-33\n" +
            "+6\n" +
            "+43\n" +
            "-103\n" +
            "-187\n" +
            "+9\n" +
            "+3\n" +
            "-82\n" +
            "-20\n" +
            "-7\n" +
            "+125\n" +
            "+72\n" +
            "+613\n" +
            "+56596\n" +
            "-18\n" +
            "-19\n" +
            "+12\n" +
            "-11\n" +
            "-19\n" +
            "+1\n" +
            "+19\n" +
            "-18\n" +
            "-6\n" +
            "-3\n" +
            "+16\n" +
            "-2\n" +
            "-10\n" +
            "-9\n" +
            "-13\n" +
            "-15\n" +
            "+16\n" +
            "+5\n" +
            "-15\n" +
            "+7\n" +
            "-8\n" +
            "-17\n" +
            "+7\n" +
            "-16\n" +
            "+14\n" +
            "+14\n" +
            "-15\n" +
            "+4\n" +
            "-15\n" +
            "-10\n" +
            "-9\n" +
            "+12\n" +
            "-15\n" +
            "+5\n" +
            "-1\n" +
            "+13\n" +
            "-15\n" +
            "-3\n" +
            "-19\n" +
            "+1\n" +
            "-6\n" +
            "-19\n" +
            "-19\n" +
            "+23\n" +
            "-25\n" +
            "-28\n" +
            "-10\n" +
            "-3\n" +
            "-21\n" +
            "-13\n" +
            "-14\n" +
            "+11\n" +
            "+18\n" +
            "-13\n" +
            "+1\n" +
            "-16\n" +
            "+14\n" +
            "+15\n" +
            "+5\n" +
            "-7\n" +
            "+10\n" +
            "+2\n" +
            "-14\n" +
            "+10\n" +
            "+11\n" +
            "+11\n" +
            "-6\n" +
            "-7\n" +
            "-4\n" +
            "+14\n" +
            "-12\n" +
            "-6\n" +
            "-3\n" +
            "-15\n" +
            "-10\n" +
            "-13\n" +
            "-17\n" +
            "+3\n" +
            "+2\n" +
            "+8\n" +
            "+18\n" +
            "-4\n" +
            "-11\n" +
            "+2\n" +
            "-12\n" +
            "+13\n" +
            "-9\n" +
            "+14\n" +
            "+17\n" +
            "+12\n" +
            "+1\n" +
            "-12\n" +
            "-14\n" +
            "+6\n" +
            "+5\n" +
            "-13\n" +
            "+20\n" +
            "-13\n" +
            "-22\n" +
            "+3\n" +
            "+15\n" +
            "+14\n" +
            "+17\n" +
            "+7\n" +
            "-22\n" +
            "-22\n" +
            "-14\n" +
            "-2\n" +
            "-20\n" +
            "+15\n" +
            "-3\n" +
            "-8\n" +
            "+13\n" +
            "+40\n" +
            "+72\n" +
            "-21\n" +
            "+25\n" +
            "-16\n" +
            "+11\n" +
            "+22\n" +
            "+22\n" +
            "+25\n" +
            "+16\n" +
            "+15\n" +
            "+15\n" +
            "+9\n" +
            "+12\n" +
            "-10\n" +
            "+9\n" +
            "+11\n" +
            "-1\n" +
            "+10\n" +
            "-16\n" +
            "+17\n" +
            "+8\n" +
            "-7\n" +
            "-17\n" +
            "+4\n" +
            "-11\n" +
            "+20\n" +
            "+10\n" +
            "+7\n" +
            "+6\n" +
            "-7\n" +
            "+8\n" +
            "-19\n" +
            "+23\n" +
            "+7\n" +
            "-1\n" +
            "-2\n" +
            "+17\n" +
            "-9\n" +
            "-3\n" +
            "+2\n" +
            "-10\n" +
            "-10\n" +
            "-23\n" +
            "+17\n" +
            "+7\n" +
            "+10\n" +
            "+6\n" +
            "+14\n" +
            "+12\n" +
            "-1\n" +
            "+3\n" +
            "-7\n" +
            "-3\n" +
            "+16\n" +
            "-11\n" +
            "+17\n" +
            "-7\n" +
            "-1\n" +
            "-3\n" +
            "-12\n" +
            "-114806";
    private static String[] tableOfFrequency;
    private static int[] intTable;
    private static int[] frequences;

    public static void main(String[] args) {
        zmienTablice();
        wpiszDoTablicy();
    }


    private static void zmienTablice() {
        String[]table = input.split("\n");
        tableOfFrequency = new String[table.length];
        intTable = new int[table.length];
        for (int i = 0; i < table.length; i++) {
            intTable[i] = Integer.parseInt(table[i]);
        }
    }

    private static void wpiszDoTablicy() {
        int i = 0;
        for (int b : intTable) {
            frequency = frequency + (b);
            i++;
        }
        System.out.println(i);
        frequences = new int[i - 1];
        System.out.println(frequences);
        checkExist(frequency);
    }

    private static boolean checkExist(int a) {

        for (int b : frequences) {   // for each
            if (b == a) {
                System.out.println(true);
                return true;
            }
        }
        System.out.println(false);
        return false;
    }
}