## How to update SDKs?

1. Install nvm

2. Install node

    `nvm install && nvm use`

3. Install dependencies

    `npm i`

4. Update openapi.yaml file

5. Run

    `npm run generate:clients`

## Pitfalls

- If you receive error 405 error when the javascript SDK is being deployed, you have to check that the package name contains the owner name before the name of the package, and it should match with the Github user

## How to customized generated code?

 - If you want to customize the code generate, you could modify the templates which are located on `templates/*`
 - If you want to modify another files, you can download the templates [here](https://github.com/OpenAPITools/openapi-generator/tree/master/modules/openapi-generator/src/main/resources)
 - Templates were built using [Mustache](https://mustache.github.io)