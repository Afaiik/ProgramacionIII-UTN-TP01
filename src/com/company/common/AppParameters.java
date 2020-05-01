package com.company.common;

public class AppParameters {
    private AppParameters() {
    }

    public static final double ARCHITECT_COST_DAY_WORK = 2000;
    public static final double MASTER_BUILDER_COST_DAY_WORK = 1800;
    public static final double BUILDER_COST_DAY_WORK = 1500;

    /*
      Solo puede haber UN arquitecto por obra.
      Mínimo UN maestro mayor y un máximo de tres por obra.
      No hay límite para los obreros pero al menos debe haber 2.
     */
    public static final int MIN_ARCHITECTS_IN_CONSTRUCTION = 1;
    public static final int MAX_ARCHITECTS_IN_CONSTRUCTION = 1;
    public static final int MIN_MASTER_BUILDER_IN_CONSTRUCTION = 1;
    public static final int MAX_MASTER_BUILDER_IN_CONSTRUCTION = 3;
    public static final int MIN_BUILDER_IN_CONSTRUCTION = 2;
    public static final String CONSTRUCTION_REQUIREMENTS_ERROR = "\nERROR: Construction Employees don't meet minimum requirements \n" +
            "\t\tPlease provide only " + MAX_ARCHITECTS_IN_CONSTRUCTION + " Architects \n" +
            "\t\tbetween " + MIN_MASTER_BUILDER_IN_CONSTRUCTION + " and " + MAX_MASTER_BUILDER_IN_CONSTRUCTION + " Master Builders \n" +
            "\t\tand at least " + MIN_BUILDER_IN_CONSTRUCTION + " Builders";

}
