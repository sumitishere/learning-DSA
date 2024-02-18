Limitations of Arrays/ArrayList
   - Arrays have fixed Size.
   - Arraylist doubles the size(Not cool).

In LinkedList random memory allocation is done, it is not continuous and datas are connected via arrows.

**HEAD -> 1 -> 2 -> 3 -> Null** (Add items anywhere in the memory and point to the next one).
These are just like Train Bogies.

In between the head and null the boxes are known as Nodes. Every single item knows about the next item. Kind of Like One Sided love 1 loves 2 2 loves three , 3 has no idea that 2 has crush on it.

**Head** - The first reference variable that points to first node.

**Tail** - The last variable pointing to the last one.

Individual box has its own type - *Node* itself is a type.

class Node{

int val;

Node next;

}

You directly can't access the index. This doesn't know when list is ending. No idea.