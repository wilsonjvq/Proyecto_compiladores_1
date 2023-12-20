# Generated from Expr.g4 by ANTLR 4.13.0
from antlr4 import *
if "." in __name__:
    from .ExprParser import ExprParser
else:
    from ExprParser import ExprParser

# This class defines a complete listener for a parse tree produced by ExprParser.
class ExprListener(ParseTreeListener):

    # Enter a parse tree produced by ExprParser#programa.
    def enterPrograma(self, ctx:ExprParser.ProgramaContext):
        pass

    # Exit a parse tree produced by ExprParser#programa.
    def exitPrograma(self, ctx:ExprParser.ProgramaContext):
        pass


    # Enter a parse tree produced by ExprParser#bloque.
    def enterBloque(self, ctx:ExprParser.BloqueContext):
        pass

    # Exit a parse tree produced by ExprParser#bloque.
    def exitBloque(self, ctx:ExprParser.BloqueContext):
        pass


    # Enter a parse tree produced by ExprParser#decls.
    def enterDecls(self, ctx:ExprParser.DeclsContext):
        pass

    # Exit a parse tree produced by ExprParser#decls.
    def exitDecls(self, ctx:ExprParser.DeclsContext):
        pass


    # Enter a parse tree produced by ExprParser#decl.
    def enterDecl(self, ctx:ExprParser.DeclContext):
        pass

    # Exit a parse tree produced by ExprParser#decl.
    def exitDecl(self, ctx:ExprParser.DeclContext):
        pass


    # Enter a parse tree produced by ExprParser#tipo.
    def enterTipo(self, ctx:ExprParser.TipoContext):
        pass

    # Exit a parse tree produced by ExprParser#tipo.
    def exitTipo(self, ctx:ExprParser.TipoContext):
        pass


    # Enter a parse tree produced by ExprParser#instrs.
    def enterInstrs(self, ctx:ExprParser.InstrsContext):
        pass

    # Exit a parse tree produced by ExprParser#instrs.
    def exitInstrs(self, ctx:ExprParser.InstrsContext):
        pass


    # Enter a parse tree produced by ExprParser#instr.
    def enterInstr(self, ctx:ExprParser.InstrContext):
        pass

    # Exit a parse tree produced by ExprParser#instr.
    def exitInstr(self, ctx:ExprParser.InstrContext):
        pass


    # Enter a parse tree produced by ExprParser#loc.
    def enterLoc(self, ctx:ExprParser.LocContext):
        pass

    # Exit a parse tree produced by ExprParser#loc.
    def exitLoc(self, ctx:ExprParser.LocContext):
        pass


    # Enter a parse tree produced by ExprParser#bool.
    def enterBool(self, ctx:ExprParser.BoolContext):
        pass

    # Exit a parse tree produced by ExprParser#bool.
    def exitBool(self, ctx:ExprParser.BoolContext):
        pass


    # Enter a parse tree produced by ExprParser#comb.
    def enterComb(self, ctx:ExprParser.CombContext):
        pass

    # Exit a parse tree produced by ExprParser#comb.
    def exitComb(self, ctx:ExprParser.CombContext):
        pass


    # Enter a parse tree produced by ExprParser#igualdad.
    def enterIgualdad(self, ctx:ExprParser.IgualdadContext):
        pass

    # Exit a parse tree produced by ExprParser#igualdad.
    def exitIgualdad(self, ctx:ExprParser.IgualdadContext):
        pass


    # Enter a parse tree produced by ExprParser#rel.
    def enterRel(self, ctx:ExprParser.RelContext):
        pass

    # Exit a parse tree produced by ExprParser#rel.
    def exitRel(self, ctx:ExprParser.RelContext):
        pass


    # Enter a parse tree produced by ExprParser#expr.
    def enterExpr(self, ctx:ExprParser.ExprContext):
        pass

    # Exit a parse tree produced by ExprParser#expr.
    def exitExpr(self, ctx:ExprParser.ExprContext):
        pass


    # Enter a parse tree produced by ExprParser#term.
    def enterTerm(self, ctx:ExprParser.TermContext):
        pass

    # Exit a parse tree produced by ExprParser#term.
    def exitTerm(self, ctx:ExprParser.TermContext):
        pass


    # Enter a parse tree produced by ExprParser#unario.
    def enterUnario(self, ctx:ExprParser.UnarioContext):
        pass

    # Exit a parse tree produced by ExprParser#unario.
    def exitUnario(self, ctx:ExprParser.UnarioContext):
        pass


    # Enter a parse tree produced by ExprParser#factor.
    def enterFactor(self, ctx:ExprParser.FactorContext):
        pass

    # Exit a parse tree produced by ExprParser#factor.
    def exitFactor(self, ctx:ExprParser.FactorContext):
        pass



del ExprParser