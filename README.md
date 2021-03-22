# income-tax-calculator

In the country of **Wonderland**, the annual income tax for an individual is calculated based on their total earnings and investments for a given financial year according to rules that are predefined for a financial year.

### Notes
- Luckily, Wonderland's Financial Year is aligned to Calendar Year i.e. Jan-Dec.
- Coincidentally, Wonderland's Currency is INR (₹) and follows [Indian Numbering System](https://en.wikipedia.org/wiki/Indian_numbering_system)

### Rules
Here are rules for last three consecutive years:

##### 2018:

| Income Range             | Tax Percentage |
| ------------------------ | :------------- |
| < ₹ 1,00,000             | 0%             |
| ₹ 1,00,001 - ₹ 5,00,000  | 10%            |
| ₹ 5,00,001 - ₹ 10,00,000 | 20%            |
| > ₹ 10,00,000            | 30%            |

- One can reduce taxable income by investing in tax-free Government Bonds up to ₹1,00,000.
- If individual’s total tax is above ₹ 5,00,000 then they are charged cess of 1% on total tax amount.

##### 2019:

| Income Range             | Tax Percentage |
| ------------------------ | :------------- |
| < ₹ 1,00,000             | 0%             |
| ₹ 1,00,001 - ₹ 6,00,000  | 10%            |
| ₹ 6,00,001 - ₹ 12,00,000 | 20%            |
| > ₹ 12,00,000            | 30%            |

- One can reduce taxable income by investing in tax free Government Bonds up to ₹1,50,000. 
- If individual’s total tax is above ₹ 5,00,000 then they are charged cess of 2% on total tax amount.
- For Taxpayers above age 60, taxable income is reduced by 50,000 for purpose of calculations.

##### 2020:

| Income Range             | Tax Percentage |
| ------------------------ | :------------- |
| < ₹ 1,00,000             | 0%             |
| ₹ 1,00,001 - ₹ 10,00,000 | 15%            |
| > ₹ 10,00,000            | 25%            |

- One can reduce taxable income by investing in tax free Government Bonds up to ₹2,00,000.
- If individual’s total tax is above ₹ 5,00,000 then they are charged cess of 5% on total tax amount.
- For Taxpayers above age 60, taxable income is reduced by 75,000 for purpose of calculations.

### Example 1:

> For Duke (aged 25), who earns ₹ 8,25,000 per annum and invests ₹75,000 in tax free govt bonds his 2019 payable tax will be calculated as follows:
>
> After investment deduction,
>
> net taxable income = ₹8,25,000 - ₹75,000 = ₹7,50,000
>
> out of which on first ₹1,00,000 tax is ₹0 
>
> on next ₹5,00,000 tax is 10% i.e. ₹50,000
>
> and on remaining ₹1,50,000 tax is 20% i.e. ₹30,000
>
> so total tax payable would be ₹80,000
>
> total cess = ₹ 0 

Dummy Input: 2019,25,825000,75000 

### Example 2:

> For Gopher (aged 65), who earns ₹ 38,00,000 per annum and invests ₹1,00,000 in tax free govt bonds. His 2020 payable tax will be calculated as follows:
>
> After investment deduction,
>
> net taxable income = ₹38,00,000 - ₹1,00,000 = ₹37,00,000
>
> Because he is above 60, he is eligible for additional deduction
>
> net taxable income = ₹37,00,000 - ₹75,000 = ₹36,25,000
>
> out of which on first ₹1,00,000 tax is ₹0 
>
> on next ₹9,00,000 tax is 15% i.e. ₹1,35,000
>
> and on remaining ₹26,25,000 tax is 25% i.e. ₹6,56,250
>
> so total tax payable would be  ₹7,91,250
>
> since tax is above ₹5,00,000 additional 5% cess will be added
>
> so cess  = ₹7,91,250 * 5% = 39,562.5 
>
> total tax + cess payable = ₹8,30,812.5 

Dummy Input: 2020,65,3800000,100000

## Problem Statement
For a given year, age of user, user's taxable income and total tax free investments, write a program that can read a file with following content format:

```
year,age,income,investment
```

e.g.

```
2019,28,500000,75000
2020,62,100000,0
2020,33,1800000,200000
```

And produce the output corresponding to each row:

```
tax,cess,total
tax,cess,total
tax,cess,total
```

Output should be int/float numbers only, no commas, no currency symbols etc.

**Good to have**: CLI Variation 

```
tax-calc --year 2019 --income 230000 --investment 75000 --age 40
```

## Important Points About Coding:
- The submission must have full unit test coverage.
- Design the solution considering future use case.
- Code as if writing for production, avoid if-else waterfalls.

# Solution
 - Start with Main.java
 - Solution is built around ProcessingYear.java, where default rules are added everry year. Hence, this will be the only changing point in whole application each year to define the differemt slabs and its tax percentages
 - Senior citizen age can be configured while providing the same in above declaration. same is appllicable for cess
 - TODO: Currently all the variables are int except the final taxamount and cess that is double. Ideally we should use BigDecimal for money related calculations and hence the data types should be corrected. Unit test cases must be added for more robust code
