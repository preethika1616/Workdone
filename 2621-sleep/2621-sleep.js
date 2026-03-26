/**
 * @param {number} millis
 * @return {Promise}
 */
async function sleep(millis) {
    const p1 = new Promise((resolve,reject) => {
        setTimeout(() => {resolve("success")} , millis);
    });

    return p1
}

/** 
 * let t = Date.now()
 * sleep(100).then(() => console.log(Date.now() - t)) // 100
 */