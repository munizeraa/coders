package poo.polimorfismo;

public class Veiculo {
    void locomover() { }
    void parar() { }
}

class Carro extends Veiculo {
    @Override
    void locomover() {
        super.locomover();
        System.out.println("Pisando no pedal de acelerador...VRUUUUM");
    }

    @Override
    void parar() {
        super.parar();
        System.out.println("Pisando no pedal de freio...IIIIIII");
    }
}

class Aviao extends Veiculo {
    @Override
    void locomover() {
        super.locomover();
        System.out.println("Decolando... FHSHFSHFHSHFHSFHHFS");
    }

    @Override
    void parar() {
        super.parar();
        System.out.println("Aterrissando... FHHUSUFHUSHFUUHSUH");
    }
}

class Skate extends Veiculo {
    @Override
    void locomover() {
        super.locomover();
        System.out.println("Remar, Remar, Remar, Remar... So os loucos sabem");
    }

    @Override
    void parar() {
        super.parar();
        System.out.println("Parando, as vezes faco o que quero...");
    }
}

























