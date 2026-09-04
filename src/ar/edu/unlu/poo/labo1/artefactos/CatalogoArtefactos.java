package ar.edu.unlu.poo.labo1.artefactos;

import java.util.*;

public class CatalogoArtefactos {

    private Set<Artefacto> almacen;

    public CatalogoArtefactos() {
        this.almacen = new HashSet<>();
    }

    public void agregarArtefacto(Artefacto artefacto){
        almacen.add(artefacto);
    }

    public Set<Artefacto> obtenerArtefactosUnicos(){
        return almacen;
    }

    public List<Artefacto> buscarArtefactosPorTipo(String tipo){
        List<Artefacto> misArtefactos = new ArrayList<>();

        for (Artefacto a : almacen){
            if (a.getTipo().equals(tipo)) misArtefactos.add(a);
        }

        for (int i = 0; i < misArtefactos.size() - 1; i++) {
            for (int j = 0; j < misArtefactos.size() - 1 - i; j++) {
                if (misArtefactos.get(j).getPoder() < misArtefactos.get(j + 1).getPoder()) {
                    Artefacto temporal = misArtefactos.get(j);
                    misArtefactos.set(j, misArtefactos.get(j + 1));
                    misArtefactos.set(j + 1, temporal);
                }
            }
        }

        return misArtefactos;
    }

    public Map<String, Integer> contarArtefactosPorTipo(){
        Map<String, Integer> conteo = new HashMap<>();

        for (Artefacto a : almacen) {
            String tipoActual = a.getTipo();


        }

        return conteo;
    }

    public Artefacto obtenerArtefactoMasPoderoso(){
        return null;
    }
}
