if __name__ is not None and "." in __name__:
    from .ExprParser import ExprParser
else:
    from .ExprParser import ExprParser

class ExprVisitor(ParseTreeVisitor):
    def __init__(self):
        self.nivell = 0