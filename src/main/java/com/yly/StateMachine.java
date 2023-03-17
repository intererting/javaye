package com.yly;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yiliyang
 * @version 1.0
 * @date 2021/1/15 上午10:41
 * @since 1.0
 */
public class StateMachine {

    public void performTransition(State nextState) {
        Map<State, State.Transition> stateTransitionMap = State.Transition.transformMap.get(State.currentState);
        State.Transition transition = stateTransitionMap.get(nextState);
        if (transition != null) {
            transition.transition();
        }
    }

    public StateMachine(State initialState) {
        State.currentState = initialState;
    }

    public enum State {
        INIT, SOLID, LIQUID;

        private static State currentState;

        private enum Transition {

            MELT(SOLID, LIQUID) {
                @Override
                void transition() {
                    currentState = State.LIQUID;
                    System.out.println("solid--------->Liquid");
                }
            },

            FREEZE(LIQUID, SOLID) {
                @Override
                void transition() {
                    currentState = State.SOLID;
                    System.out.println("liquid------------>solid");
                }
            };

            private final State src;
            private final State dst;

            private final static Map<State, Map<State, Transition>> transformMap = new HashMap<>();

            static {
                for (State state : State.values()) {
                    transformMap.put(state, new HashMap<>());
                }
                for (Transition transition : Transition.values()) {
                    transformMap.get(transition.src).put(transition.dst, transition);
                }
            }

            Transition(State src, State dst) {
                this.src = src;
                this.dst = dst;
            }

            abstract void transition();
        }
    }

    public static void main(String[] args) {
        StateMachine stateMachine = new StateMachine(State.LIQUID);
        stateMachine.performTransition(State.SOLID);
        stateMachine.performTransition(State.LIQUID);
    }
}
