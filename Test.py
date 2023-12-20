from antlr4 import *
from ExprLexer import ExprLexer
from ExprParser import ExprParser
#from TreeVisitor import TreeVisitor
from EvalVisitor import EvalVisitor

input_stream = InputStream(input('?'))

lexer = ExprLexer(input_stream)
token_stream = CommonTokenStream(lexer)
parser = ExprParser(token_stream)
tree = parser.root()

print(tree.toStringTree(recog=parser))

#visitor = TreeVisitor()
#visitor.visit(tree)

visitor = EvalVisitor()
visitor.visit(tree)

#ejecutar py:
#python

# >>> exec(open("Test.py").read())
#15*3-10/5+7*2**3-1

# >>> exec(open("EvalVisitor.py").read())
#15*3-10/5+7*2**3-1
