/**
 * @author Daniel Coll
 * @version 1.0
 * @since 07/02/2023
 */
public class EntradaBlogDCF {

public static char separador=':';
private int id;
private String texto;
private String autor;

        /**
         * @param id - identificador de la entrada.
         * @param autor - autor de la entrada.
         * @param texto - contenido de la entrada.
         * @throws IllegalArgumentException - si el id es negativo lanza error.
         */
        public EntradaBlogDCF(int id,String autor,String texto)throws IllegalArgumentException{
        if(id<=0) throw new IllegalArgumentException("El id no puede ser negativo");
        this.id=id;
        this.autor=autor;
        this.texto=texto;
        }

        /**
         * Devuelve el toString de la clase.
         * @return
         */
        @Override
public String toString(){
        String cad="";
        cad+="\nENTRADA DE"+separador+autor;
        cad+="\n "+texto;
        return cad;
        }

        /**
         * Devuelve el ID.
         * @return
         */
        public int getId(){
        return this.id;
        }

        /**
         * Devuelve el contenido.
         * @return
         */
        public String getTexto(){
        return this.texto;
        }

        /**
         * Devuelve el autor en mayúsculas.
         * @return
         */
        public String getAutor(){
        return this.autor.toUpperCase();
        }

        /**
         * Devuelve el nombre del autor. En desuso, ver getAutor.
         * @return
         */
        public String devuelveAutor(){
        return this.autor;
        }

        /**
         * @param args - Si es necesario, se introducen argumentos (no obligatorio).
         */
        public static void main(String[] args) {
        EntradaBlogDCF e1=new EntradaBlogDCF (-3,"ana","Últimas noticias, está disponible BixBy 2.0");
        System.out.println(e1);
        }
        }