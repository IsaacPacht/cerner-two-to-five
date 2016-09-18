// Madlibs-esque Engineering Impact Poem Generator.  
//
// Enter a word of the requested type at each prompt.  
// Press enter to accept the "default" word for that prompt.
// Press enter for all prompts to print the "original" poem.
//
// Needs a console for input, so must be run from the command line,
// not an IDE.
def poem = """
Once I knew an [engineer:profession]
He wrote a [program:noun] for me
It's [usefulness:noun] is [minimal:adjective]
It does no more than [bore:transitive verb] me

It has [keywords:plural noun] long and [short:adjective]
The type system is [static:adjective]
Which might appeal to some, perhaps
But I prefer [dynamic:adjective]

The interface is [clunky:adjective]
Performance is a flop
The thing pays me no never-mind
When I tell it to [stop:imperative verb]

"You'll [use:transitive verb] this thing for sixty years", 
he said, "to be exact"
But I'd be [shocked:past participle] to ever find
That it's made an impact
"""

def matcher = (poem =~ "\\[([A-Za-z ]+)\\:([A-Za-z ]+)\\]")

def sb = new StringBuffer();
while (matcher.find()) {
    def replacement = System.console().readLine "${matcher.group(2)}:"
    matcher.appendReplacement(sb, replacement.isEmpty() ? matcher.group(1) : replacement);
}
matcher.appendTail(sb);

println sb.toString()