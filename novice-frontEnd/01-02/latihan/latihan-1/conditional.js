// if (condition) {
//     statement_1;
// } else {
//     statement_2;
// }

// if (condition_1) {
//     statement_1;
// } else if (condition_2) {
//     statement_2;
// } else if (condition_n) {
//     statement_n;
// } else {
//     statement_last;
// }

// if (condition) {
//     statement_1_runs_if_condition_is_true;
//     statement_2_runs_if_condition_is_true;
// } else {
//     statement_3_runs_if_condition_is_false;
//     statement_4_runs_if_condition_is_false;
// }

function checkData() {
    if (document.form1.threeChar.value.length == 3) {
        return true;
    } else {
        alert(
            'Enter exactly three characters. ' +
            `${document.form1.threeChar.value} is not valid.`);
        return false;
    }
}