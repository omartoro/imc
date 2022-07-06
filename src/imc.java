public class imc {

    private float peso;
    private float altura;
    private float imc;

    public imc(float peso, float altura, float imc){
        this.peso=peso;
        this.altura=altura;
        this.imc=imc;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getImc() {
        return imc;
    }

    public void setImc(float imc) {
        this.imc = imc;
    }
    @Override
    public String toString(){
        return "el imc es:" + (peso/(altura*altura));
    }

    }

