����   = e  *hora_aula/HT04/aulajava01/Parquinho$Humano  java/lang/Object this$0 %Lhora_aula/HT04/aulajava01/Parquinho; <init> ((Lhora_aula/HT04/aulajava01/Parquinho;)V Code	    
     ()V LineNumberTable LocalVariableTable this ,Lhora_aula/HT04/aulajava01/Parquinho$Humano; getAlimentar 2(Lhora_aula/HT04/aulajava01/Parquinho$Cachorro;F)V
    ,hora_aula/HT04/aulajava01/Parquinho$Cachorro   setRacao (F)V	    java/lang/System    out Ljava/io/PrintStream;	  " # $ nome Ljava/lang/String;	  & ' ( peso F   * + , makeConcatWithConstants '(Ljava/lang/String;F)Ljava/lang/String;
 . 0 / java/io/PrintStream 1 2 println (Ljava/lang/String;)V c .Lhora_aula/HT04/aulajava01/Parquinho$Cachorro; quantidadeRacao 
getBrincar 1(Lhora_aula/HT04/aulajava01/Parquinho$Cachorro;)V	  9 : ; energia I=���
  > ?  setPeso  A + B ((Ljava/lang/String;FI)Ljava/lang/String;  D + E &(Ljava/lang/String;)Ljava/lang/String; StackMapTable 
getCarinho  D 
SourceFile Parquinho.java BootstrapMethods
 M O N $java/lang/invoke/StringConcatFactory + P �(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; L S Peso atual de  é  Kg U + está com pedo de  e energia de  pontos W #está cansado, melhor ir para casa Y  está cheio de energia InnerClasses \ #hora_aula/HT04/aulajava01/Parquinho Cachorro Humano ` %java/lang/invoke/MethodHandles$Lookup b java/lang/invoke/MethodHandles Lookup NestHost !               	   4     
*+� 
*� �           r        
         	   _     +$� � +� !+� %� )  � -�           z  {  |                 3 4     5 (   6 7  	   �     7+� 8� #+<� =� +� !+� %+� 8� @  � -� � +� !� C  � -�           �  �  � $ � ' � 6 �        7       7 3 4  F    '  G 7  	   k     %+� 8� +Y� 8`� 8� � +� !� H  � -�           �  � $ �        %       % 3 4  F      I    J K     Q  R Q  T Q  V Q  X Z      [ ]   [ ^  _ a c  d    [