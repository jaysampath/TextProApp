# TextProApp

This TextProApp is basically a text editor. It has some cool features which you won't find in a general text-editor. This has a text field, where you can copy-paste the some text
or you can use "Load Text" button to load text from text files from your local device.

Button "Flesh Index" is used to display Flesh-Readability score of the given text. Flesh Index field where score is displayed.
Find more at: https://en.wikipedia.org/wiki/Flesch%E2%80%93Kincaid_readability_tests

Button "Generate Markov Text" is used to generate markov text for the given number of words, using the given text.
Find more at: https://en.wikipedia.org/wiki/Markov_chain#Markov_text_generators

Button "Edit Distance", takes 2 words as input and returns the no of changes required to change word one to word two.

General features "Spelling Suggestion" and "Auto-Complete" are added as checkboxes. Ticking this checkbox will enable those functionalities by the app.

Clear button to clear the text present in the text field.

This project brushes up the knowledge of Data Structures as well. Used the right Ds for optimised solution.

src.document.Document.java, src.document.BasicDocument.java       ----              Strings

src.document.EfficientDocument.java        ----           Efficiency Analysis and Benchmarking

textgen.MyLinkedList*.java, textgen.MarkovTextGenerator.java, textgen.MarkovTextGenerator*.java    ----     Interfaces, Linked Lists vs. Arrays, and Correctness



spelling.SpellingSuggest.java, spelling.AutoComplete.java, spelling.Dictionary.java, spelling.Dictionary*.java, spelling.AutoCompleteDictionaryTrie.java, spelling.TrieNode.java   ----    Trees (including Binary Search Trees and Tries)






spelling.WordPath.java, spelling.NearbyWords.java, spelling.WPTree.java        -----    Hash Maps and Edit Distance




