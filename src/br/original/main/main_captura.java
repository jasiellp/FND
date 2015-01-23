package br.original.main;


import com.olf.openjvs.IContainerContext;
import com.olf.openjvs.IScript;
import com.olf.openjvs.OConsole;
import com.olf.openjvs.OException;

public class main_captura implements IScript
{
    public void execute(IContainerContext context) throws OException
    {
        OConsole.oprint("Hello World!");
    }
}
