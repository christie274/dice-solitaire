package edu.cnm.deepdive.dicesolitaire.model;

public enum GameState {

  /** Initial state before the first roll. */
  INITAL,
  /** State starting with first roll, until maximum scratch and count is reached. */
  IN_PROGRESS,
  /** State after maximun scratch count is reached. */
  TERMINAL;


}
