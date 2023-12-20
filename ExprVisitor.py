# Generated from Expr.g4 by ANTLR 4.13.0
from antlr4 import *
if "." in __name__:
    from .ExprParser import ExprParser
else:
    from ExprParser import ExprParser

# This class defines a complete generic visitor for a parse tree produced by ExprParser.

class ExprVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by ExprParser#programa.
    def visitPrograma(self, ctx:ExprParser.ProgramaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#bloque.
    def visitBloque(self, ctx:ExprParser.BloqueContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#decls.
    def visitDecls(self, ctx:ExprParser.DeclsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#decl.
    def visitDecl(self, ctx:ExprParser.DeclContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#tipo.
    def visitTipo(self, ctx:ExprParser.TipoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#instrs.
    def visitInstrs(self, ctx:ExprParser.InstrsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#instr.
    def visitInstr(self, ctx:ExprParser.InstrContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#loc.
    def visitLoc(self, ctx:ExprParser.LocContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#bool.
    def visitBool(self, ctx:ExprParser.BoolContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#comb.
    def visitComb(self, ctx:ExprParser.CombContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#igualdad.
    def visitIgualdad(self, ctx:ExprParser.IgualdadContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#rel.
    def visitRel(self, ctx:ExprParser.RelContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#expr.
    def visitExpr(self, ctx:ExprParser.ExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#term.
    def visitTerm(self, ctx:ExprParser.TermContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#unario.
    def visitUnario(self, ctx:ExprParser.UnarioContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#factor.
    def visitFactor(self, ctx:ExprParser.FactorContext):
        return self.visitChildren(ctx)



del ExprParser