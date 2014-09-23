# Ordinal Numbers #

You know how sometimes there are two letters at the end of a number? Like 1st, 2nd, 3rd, and so on? Those numbers are called "ordinal numbers"; numbers used to refer to a position in a series. It might be useful to have a function that returns those two letters so we can print it out and what-have-you.

Your task is to write the `ordinal(number, brief)` method. `number` will be an integer, and `brief` will be an optional parameter. Sometimes 2nd and 3rd are shown as 2d and 3d, in certain fields (like legal or military stuff). So take this into account when you're writing your function. ordinal(number, brief) should return a string containing those two characters (or one character) that would be tagged onto the end of the number.

The units number (the last digit) should be used to determine the correct ordinal suffix. The following table should be used:

0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9
--- | --- | --- | --- | --- | --- | --- | --- | --- | ---
th | st | nd | rd | th | th | th | th | th | th

If the "brief" notation is used, 2 and 3's suffix should be "d".

If the tens number (the second from last digit) is a 1 (from 10 to 19), the suffix should be "th".

Some examples would be: 1st 11th 111th 121st 20th 52nd 903d (brief), and so on...


# Zero fill... for the Queen! #

Queen of the Forest needs a function that will add a specified quantity of leading zeros to any given number.

For example, if a 5-digit number is needed, and we pass in 11, the returned value would be 00011. There are many ways to achieve this. Let's have one that would be both useful and good performance-wise.


# TDD Task: Simple CSS selector comparison #

Cascading Style Sheets (CSS) is a style sheet language used for describing the look and formatting of a document written in a markup language. A style sheet consists of a list of rules. Each rule or rule-set consists of one or more selectors, and a declaration block. Selector describes which element it matches.

Sometimes element is matched to multiple selectors. In this case, element inherits multiple styles, from each rule it matches. Rules can override each other. To solve this problem, each selector has it's own 'specificity' - e.g. weight. The selector with greater specificity overrides the other selector.

Your task is to calculate the weights of two selectors and determine which of them will beat the other one.

```java
compare("body p", "div"); // returns "body p"
compare(".class", "#id"); // returns "#id"
compare("div.big", ".small"); // returns "div.big"
compare(".big", ".small"); // returns ".small" (because it appears later)
```

For simplicity, all selectors in test cases are CSS1-compatible, test cases don't include pseudoclasses, pseudoelements, attribute selectors, etc. Below is an explanation on how to weight two selectors. You can read more about specificity here.

The simplest selector type is `tagname` selector. It writes as a simple alphanumeric identifier: eg `body`, `div`, `h1`, etc. It has the least weight. If selectors have multiple elements - the selector with more elements win. For example, `body p` beats `div`, because it refers to 2 (nested) elements rather than 1.

Another simple selector is `.class` selector. It begins with dot and refer to element with specific `class` attribute. Class selectors can also be applied to tagname selectors, so `div.red` refer to `<div class="red">` element. They can be grouped, for example, `.red.striped`. Class selector beats tagname selector.

The most weighted selector type in stylesheet is `#id` selector. It begins with hash sign and refer to element with specific `id` attribute. It can also be standalone, or applied to an element. Id selector beats both selector types.

And the least weighted selector is `*`, which has no specificity and can be beat by any other selector.

Selectors can be combined, for example, `body #menu ul li.active` refers to `li` element with `class="active"`, placed inside ul element, placed inside element width `id="menu"`, placed inside `body`.

Specificity calculation is simple.

-  Selector with more `#id` selectors wins
-  If both are same, the winner is selector with more `.class` selectors
-  If both are same, selector with more elements wins
-  If all of above values are same, the winner is selector that appear last
For example, let's represent the number of `#id` , `.class`, `tagname` selectors as array (in order from worst to best):

Selector | Specifity (`#id`,`.class`,`tagname`)
--- | ---
`*` | 0, 0, 0
`span` | 0, 0, 1
`body p` | 0, 0, 2
`.green` | 0, 1, 0
`apple.yellow` | 0, 1, 1
`div.menu li` | 0, 1, 2
`.red .orange` | 0, 2, 0
`div.big .first` | 0, 2, 1
`#john` | 1, 0, 0
`div#john` | 1, 0, 1
`body #john span` | 1, 0, 2
`menu .item #checkout.active` | 1, 2, 1
`#foo div#bar.red .none` | 2, 2, 1
