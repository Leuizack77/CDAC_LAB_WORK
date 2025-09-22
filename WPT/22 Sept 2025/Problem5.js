// setImmediate(() => {
//   console.log("setImmediate: 1st immediate");
// });

// process.nextTick(() => {
//   console.log("process.nextTick: 1st process");
// });

// setTimeout(() => {
//   console.log("setTimeout: 1st timeout");
// }, 0);

// Promise.resolve().then(() => {
//   console.log("Promise.then: 1st promise");
// });


setImmediate(function A() {
	console.log("1st immediate");
});
process.nextTick(function C() {
	console.log("1st process");
});
console.log("program started");