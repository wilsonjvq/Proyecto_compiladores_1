if __name__ is not None and "." in __name__:
    from .ExprParser import ExprParser
    from .ExprVisitor import ExprVisitor
else:
    from ExprParser import ExprParser
    from ExprVisitor import ExprVisitor

class EvalVisitor(ExprVisitor):
    def visitRoot(self, ctx):
        l = list(ctx.getChindren())
        print(self.visit(l[0]))
        
    def visitValor(self, ctx):
        l = list(ctx.getChindren())
        return int(l[0].getText())

    def visitPotencia(self, ctx):
        l = list(ctx.getChindren())
        return self.visit(l[0]) ** self.visit(l[2])

    def visitProducto(self, ctx):
        l = list(ctx.getChindren())
        return self.visit(l[0]) * self.visit(l[2])

    def visitDivision(self, ctx):
        l = list(ctx.getChindren())
        return self.visit(l[0]) / self.visit(l[2])

    def visitSuma(self, ctx):
        l = list(ctx.getChindren())
        return self.visit(l[0]) + self.visit(l[2])

    def visitResta(self, ctx):
        l = list(ctx.getChindren())
        return self.visit(l[0]) - self.visit(l[2])