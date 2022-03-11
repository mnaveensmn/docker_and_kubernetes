import { render, screen } from "@testing-library/react";
import App from "./App";

test("should render the App component", () => {
  render(<App />);
  const paragraphElement = screen.getByText(/Hello Docker/i);
  expect(paragraphElement).toBeInTheDocument();
});

test("should render the App component", () => {
  render(<App />);
  const paragraphElement = screen.getByText(/Docker/i);
  expect(paragraphElement).toBeInTheDocument();
});
