package br.original.main;


import com.olf.openjvs.IContainerContext;
import com.olf.openjvs.IScript;
import com.olf.openjvs.OConsole;
import com.olf.openjvs.OException;

/*
 * desenvolvido por jasiel
 * 
 * 
 * */

public class main_captura implements IScript
{
	
	private int j = 0;
	
    public void execute(IContainerContext context) throws OException
    {
        OConsole.oprint("Hello World! "+j);
    }
}
