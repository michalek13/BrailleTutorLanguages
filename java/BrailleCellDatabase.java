package com.lukeneedham.brailletutor.Braille;

import android.content.Context;

public abstract class BrailleCellDatabase
{
    public static final BrailleCell CellA = new BrailleCell('A', true, false, false, false, false, false); // [1]
    public static final BrailleCell CellB = new BrailleCell('B', true, true, false, false, false, false); //but [12]
    public static final BrailleCell CellC = new BrailleCell('C', true, false, false, true, false, false); //can [14]
    public static final BrailleCell CellD = new BrailleCell('D', true, false, false, true, true, false); //do [145]
    public static final BrailleCell CellE = new BrailleCell('E', true, false, false, false, true, false); //every [15]
    public static final BrailleCell CellF = new BrailleCell('F', true, true, false, true, false, false); //from [124]
    public static final BrailleCell CellG = new BrailleCell('G', true, true, false, true, true, false); //go [1245]
    public static final BrailleCell CellH = new BrailleCell('H', true, true, false, false, true, false); //have [125]
    public static final BrailleCell CellI = new BrailleCell('I', false, true, false, true, false, false); // [24]
    public static final BrailleCell CellJ = new BrailleCell('J', false, true, false, true, true, false); //just [245]
    public static final BrailleCell CellK = new BrailleCell('K', true, false, true, false, false, false); //knowledge [13]
    public static final BrailleCell CellL = new BrailleCell('L', true, true, true, false, false, false); //like [123]
    public static final BrailleCell CellM = new BrailleCell('M', true, false, true, true, false, false); //more [134]
    public static final BrailleCell CellN = new BrailleCell('N', true, false, true, true, true, false); //not [1345]
    public static final BrailleCell CellO = new BrailleCell('O', true, false, true, false, true, false); // [135]
    public static final BrailleCell CellP = new BrailleCell('P', true, true, true, true, false, false); //people [1234]
    public static final BrailleCell CellQ = new BrailleCell('Q', true, true, true, true, true, false); //quite [12345]
    public static final BrailleCell CellR = new BrailleCell('R', true, true, true, false, true, false); //rather [1235]
    public static final BrailleCell CellS = new BrailleCell('S', false, true, true, true, false, false); //so [234]
    public static final BrailleCell CellT = new BrailleCell('T', false, true, true, true, true, false); //that [2345]
    public static final BrailleCell CellU = new BrailleCell('U', true, false, true, false, false, true); //us [136]
    public static final BrailleCell CellV = new BrailleCell('V', true, true, true, false, false, true); //very [1236]
    public static final BrailleCell CellW = new BrailleCell('W', false, true, false, true, true, true); //will [2456]
    public static final BrailleCell CellX = new BrailleCell('X', true, false, true, true, false, true); //it [1346]
    public static final BrailleCell CellY = new BrailleCell('Y', true, false, true, true, true, true); //you [13456]
    public static final BrailleCell CellZ = new BrailleCell('Z', true, false, true, false, true, true); //as [1356]

    public static final BrailleCell CellWhitespace = new BrailleCell(' ', false, false, false, false, false, false); // []
    public static final BrailleCell CellNumbersign = new BrailleCell('#', false, false, true, true, true, true); // [3456]

    public static final BrailleCell CellFullstop = new BrailleCell('4', false, true, false, false, true, true); //dis [256]
    public static final BrailleCell CellQuestionmark = new BrailleCell('8', false, true, true, false, false, true); //his [236
    public static final BrailleCell CellExclamationmark = new BrailleCell('6', false, true, true, false, true, false); //ff [235]
    public static final BrailleCell CellComma = new BrailleCell('1', false, true, false, false, false, false); //ea [2]
    public static final BrailleCell CellColon = new BrailleCell('3', false, true, false, false, true, false); //con, cc [25]
    public static final BrailleCell CellSemicolon = new BrailleCell('2', false, true, true, false, false, false); //bb, be [23]
    public static final BrailleCell CellApostrophe = new BrailleCell('\'', false, false, true, false, false, false); // [3]
    public static final BrailleCell CellHyphen = new BrailleCell('-', false, false, true, false, false, true); // [36]
    public static final BrailleCell CellCloseQuote = new BrailleCell('0', false, false, true, false, true, true); //was [356]

    public static final BrailleCell CellCapitalsign = new BrailleCell(',', false, false, false, false, false, true); // [6]

    public static final BrailleCell CellGG = new BrailleCell('7', false, true, true, false, true, true); //were [2356]
    public static final BrailleCell CellST = new BrailleCell('/', false, false, true, true, false, false); //still [34]
    public static final BrailleCell CellCH = new BrailleCell('*', true, false, false, false, false, true); //child [16]
    public static final BrailleCell CellGH = new BrailleCell('<', true, true, false, false, false, true); // [126]
    public static final BrailleCell CellSH = new BrailleCell('%', true, false, false, true, false, true); //shall [146]
    public static final BrailleCell CellTH = new BrailleCell('?', true, false, false, true, true, true); //this [1456]
    public static final BrailleCell CellWH = new BrailleCell(':', true, false, false, false, true, true); //which [156]
    public static final BrailleCell CellED = new BrailleCell('$', true, true, false, true, false, true); // [1246]
    public static final BrailleCell CellER = new BrailleCell(']', true, true, false, true, true, true); // [12456]
    public static final BrailleCell CellOU = new BrailleCell('\\', true, true, false, false, true, true); //out [1256]
    public static final BrailleCell CellOW = new BrailleCell('[', false, true, false, true, false, true); // [246]
    public static final BrailleCell CellEN = new BrailleCell('5', false, true, false, false, false, true); //enough [26]
    public static final BrailleCell CellING = new BrailleCell('+', false, false, true, true, false, true); // [346]
    public static final BrailleCell CellAR = new BrailleCell('>', false, false, true, true, true, false); // [345]
    public static final BrailleCell CellIN = new BrailleCell('9', false, false, true, false, true, false); // [35]

    public static final BrailleCell CellAND = new BrailleCell('&', true, true, true, true, false, true); // [12346]
    public static final BrailleCell CellFOR = new BrailleCell('=', true, true, true, true, true, true); // [123456]
    public static final BrailleCell CellOF = new BrailleCell('(', true, true, true, false, true, true); // [12356]
    public static final BrailleCell CellTHE = new BrailleCell('!', false, true, true, true, false, true); // [2346]
    public static final BrailleCell CellWITH = new BrailleCell(')', false, true, true, true, true, true); // [23456]

    public static final BrailleCell Cell5 = new BrailleCell('"', false, false, false, false, true, false); // [5]
    public static final BrailleCell Cell45 = new BrailleCell('^', false, false, false, true, true, false); // [45]
    public static final BrailleCell Cell456 = new BrailleCell('_', false, false, false, true, true, true); // [456]
    public static final BrailleCell Cell46 = new BrailleCell('.', false, false, false, true, false, true); // [46]
    public static final BrailleCell Cell56 = new BrailleCell(';', false, false, false, false, true, true); // [56]
    public static final BrailleCell Cell4 = new BrailleCell('@', false, false, false, true, false, false); // [4]

    public static final BrailleCell[] allCells = {CellA, CellB, CellC, CellD, CellE, CellF, CellG, CellH, CellI, CellJ, CellK, CellL, CellM, CellN, CellO, CellP, CellQ, CellR, CellS, CellT, CellU, CellV, CellW, CellX,
            CellY, CellZ, CellWhitespace, CellNumbersign, CellFullstop, CellQuestionmark, CellExclamationmark, CellComma, CellColon, CellSemicolon, CellApostrophe, CellHyphen, CellCloseQuote,
            CellCapitalsign, CellGG, CellST, CellCH, CellGH, CellSH, CellTH, CellWH, CellED, CellER, CellOU, CellOW, CellEN, CellING, CellAR, CellIN, CellAND, CellFOR, CellOF, CellTHE, CellWITH, Cell4, Cell5, Cell45, Cell456, Cell46, Cell56};

    public static BrailleCell lookUpCell(BrailleCell in)
    {
        for(BrailleCell cell : allCells)
        {
            if(cell.equals(in))
                return cell;
        }
        return null;
    }

    public static BrailleCell lookUpCell(char font)
    {
        for(BrailleCell cell : allCells)
        {
            if(cell.getFontSymbol()==font)
                return cell;
        }
        return null;
    }

    public static String getDotDescriptionsFromFont(String font, Context con)
    {
        String res = "";

        for(char c : font.toCharArray())
        {
            BrailleCell cell = lookUpCell(c);
            if(cell != null)
            {
                res += cell.getDotsDescription(con) + ". ";
            }
        }

        return res;
    }
}
