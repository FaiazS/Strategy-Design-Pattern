# 🧭 Path Navigator – Strategy Design Pattern Example

This project demonstrates the use of the **Strategy Design Pattern** in Java through a simple example of a path-finding system that dynamically selects an algorithm based on the **transportation mode** (`WALK`, `BIKE`, `CAR`).

---

## 🚀 Overview

In real-world apps like Google Maps, users can choose how they want to travel. Each mode of transport (walk, bike, car) uses a different **pathfinding strategy**.

This project mimics that behavior using:

- **Strategy Pattern** to switch algorithms at runtime.
  
- **Factory Pattern** to decide which strategy to use.
  
- A clean separation of concerns using interfaces and enums.

---

## 📦 Project Structure

```bash
com.scaler.StrategyDesignPattern/
├── PathFindingAlgorithm.java        # Strategy interface
├── WalkPathFindingAlgorithm.java   # Strategy 1
├── BikePathFindingAlgorithm.java   # Strategy 2
├── CarPathFindingAlgorithm.java    # Strategy 3
├── PathNavigatorFactory.java       # Factory to choose strategy
├── PathNavigator.java              # Context that uses strategies
└── TransportMode.java              # Enum to represent transport modes

---
🧠 Design Patterns Used

✅ Strategy Pattern:

Encapsulates a family of algorithms and makes them interchangeable. Each algorithm (walk, bike, car) implements a common interface.

✅ Factory Pattern:

Selects and provides the correct strategy instance based on the transport mode. Keeps strategy selection logic separate from the usage.
