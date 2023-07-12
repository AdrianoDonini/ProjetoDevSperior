package com.devsuperior.dslist.intities;

public class Game {
   private Long id;
   private String title;
   private Integer year;
   private String genere;
   private String plataform;
   private String shortDescription;
   private String longDescription; 

   public Game(Long id, String title, Integer year, String genere, String plataform,
   String shortDescription, String longDescription) {
    this.id = id;
    this.title = title;
    this.year = year;
    this.genere = genere;
    this.plataform = plataform;
    this.shortDescription = shortDescription;
    this.longDescription = longDescription;
   }
   public void setId(Long id){
    this.id = id;
   }
   public void setYear(Integer year){
    this.year = year;
   }
   public void setGenere(String genere){
    this.genere = genere;
   }
   public void setPlataform(String plataform){
    this.plataform = plataform;
   }
   public void setShorDescription(String shortDescription){
    this.shortDescription = shortDescription;
   }
   public void setLongDescription(String longDescription){
    this.longDescription = longDescription;
   }
   public Long getId(){
    return id;
   }
   public Integer getYear(){
    return year;
   }
   public String getGenere(){
    return genere;
   }
   public String getPlataform(){
    return plataform;
   }
   public String getLongDescription(){
    return longDescription;
   }
   public String getShortDescription(){
    return shortDescription;
   }
}
