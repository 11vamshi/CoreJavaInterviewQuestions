# Cloning Demo, points to remember

refer 
https://programmingmitra.blogspot.com/2017/01/Java-cloning-copy-constructor-versus-Object-clone-or-cloning.html
https://dzone.com/articles/shallow-and-deep-java-cloning


**conclusion is worst though**

The program is used to test default cloning behavior of clone() method of any Cloneable class which is shallow cloning

if u dont implement cloneable Interface u cant clone

Object.clone() is the method which creates a clone for you, whose access-level is protected, and that is the reason client 
cannot create a clone of our object himself by calling clone, client class the clone() method of our obj and which in turn calls
super.clone() since it has access to protected member.  

Also not that is the reason we dont annotate @Override on top of clone()


Un-commenting below lines in ClonablewithShallow class makes deep cloning possible in our code. 
clonedObj.child = (ChildObject) this.child.clone();
clonedObj.numList = (ArrayList<AtomicInteger>) this.numList.clone(); 