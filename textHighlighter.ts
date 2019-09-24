// cerner_2^5_2019
// uses:  textHighlighter-package.json  (also in this folder)

const chalk = require('chalk');

function lookup(value: string, fulltext: string) : string{
    let highlightedValue = highlightText(value);
    let parts = fulltext.split(value);

    return parts.join(highlightedValue);
}

function highlightText(input: string){
    return chalk.blue.bgRed.bold(input);
}

let inputText = "I like this thing.  I like that thing.  How about that.  I like this, that, those, all kinds of things.";
let toFind = "thing";

let result = lookup(toFind, inputText);
console.log(result);