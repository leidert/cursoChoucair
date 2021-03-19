# Autor: leider tanos
  @stories
  Feature: Academy Choucair
    As a user, i want to learn how to automate in screemplay at the Choucair Academy with the automation course
    @scenario1
    Scenario: search for a automation course
      Given than brandon wants to learn automation at the academy Chocair
      |userName | password |
      |1067891990 | Choucair2021*|
      When he search for the course ISTQB Agile Tester Extension on the choucair academy platform
      |nameCourse|
      |ISTQB Agile Tester Extension|
      Then he finds the course called resources ISTQB Agile Tester Extension