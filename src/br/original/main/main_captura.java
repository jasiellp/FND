package br.original.main;


import com.olf.openjvs.IContainerContext;
import com.olf.openjvs.IScript;
import com.olf.openjvs.OConsole;
import com.olf.openjvs.OException;

/*
 * desenvolvido por jasiel
 * com ajuda do antonio
 * 
 * */

public class main_captura implements IScript
{
	
	private int j = 0;
	private int a = 0;
	private int s = 0;
	private int i = 0;
	private int e = 0;
	private int l = 0;
	
    public void execute(IContainerContext context) throws OException 
    {
    	this.pint_meu_nome();
    }
    
    
    private void pint_meu_nome()throws OException{
    	OConsole.oprint("M D U "+j);
    	OConsole.oprint("M D U "+a);
    	OConsole.oprint("M D U "+s);
    	OConsole.oprint("M D U "+i);
    	OConsole.oprint("M D U "+e);
    	OConsole.oprint("M D U "+l);	
    }
}
