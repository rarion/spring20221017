<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="my" tagdir="/WEB-INF/tags" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css" integrity="sha512-xh6O/CkQoPOWDdYTDqeRdPCVd1SpvCA9XXcUnZS2FmJNp1coAFzvtCN9BmamE+4aHK8yyUHUSCcJHgXloTyT2A==" crossorigin="anonymous" referrerpolicy="no-referrer" />
<style>
  h1{
            margin: auto;
            text-align: center;
        }
        h2{
            display: flex;
            background-color: yellow;
            text-align: center;
            width: 400px;
            border-radius: 40px;
        }
        .a{
            display: flex;
        }
        .zero{
            display: flex;
            text-align: center;
            background-color: skyblue;
            width: 100%;
            height: 100%;
        }
        #ul1{
            display: inline-block;
        }
        .sample{
            background-color:  lightyellow;
            display: flex;
            text-align: center;
            color:black;
            font-size: 14px;
            font-weight: bold;
            height: 40px;
        }
        .sample>div{
            padding:10px 50px 5px;           
        }
        .sample>div:hover {
            background-color: lightgrey;

        }
        .ml-auto{
            margin-left: auto;
        }

</style>
</head>
<body>

	<my:navBar></my:navBar>
	 <div class="sample">
        <i class="fa-2x fa-solid fa-house-chimney" style="margin: 3px 1px 3px 30px;"></i>
        <div>Alice <i class="fa-solid fa-caret-down"></i></div>
        <div>Anna <i class="fa-solid fa-caret-down"></i></div>
        <div>Hi <i class="fa-solid fa-caret-down"></i></div>
        <div>Silence <i class="fa-solid fa-caret-down"></i></div>
        <div>Darkness <i class="fa-solid fa-caret-down"></i></div>
        <div class="ml-auto"><i class="fa-solid fa-circle-half-stroke"></i></div>
        <div><i class="fa-solid fa-earth-asia"></i></div>
        <div><i class="fa-solid fa-magnifying-glass"></i>></i></div>
        <input type="text" id="input1" style="border-radius:40px" >
        <button id="btn1" style="border-radius:40px">TEXT</button>
    </div>

    <div class="zero">
        <div class="one" style="flex:1;">
           <h1>DOLL</h1>
           <div class="a">
               <h2><i class="fa-solid fa-sun"></i></h2>
               <p> Lorem ipsum dolor sit, amet consectetur adipisicing elit. Eius, dignissimos nostrum labore vero modi, sed porro laborum alias nisi ut consectetur optio mollitia tempore. Vel sequi rem cum distinctio eveniet.</p>
           </div>    
           <div class="a">
               <h2><i class="fa-solid fa-moon"></i></h2>
               <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Quas laudantium ducimus sunt incidunt itaque, architecto delectus dolores nam. Fugit amet nam aut animi ut quibusdam impedit dolore delectus aliquid fuga.</p>
           </div>
           <div class="a">    
               <h2><i class="fa-solid fa-star"></i></h2>
               <p>Lorem ipsum, dolor sit amet consectetur adipisicing elit. Tempore ad ullam dolorem, aut ipsum, ratione iste quae quis, expedita sapiente illo amet nostrum eligendi explicabo quos pariatur? Alias, ratione consequuntur.</p>
           </div>

           <hr>


           <div class="container">
            <div class="row">
                <div class="col">
                    <div id="carouselExampleIndicators" class="carousel slide" data-bs-ride="false">
                        <div class="carousel-indicators">
                            <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="0"
                                class="active" aria-current="true" aria-label="Slide 1"></button>
                            <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="1"
                                aria-label="Slide 2"></button>
                            <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="2"
                                aria-label="Slide 3"></button>
                            <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="3"
                                aria-label="Slide 4"></button>
                        </div>
                        <div class="carousel-inner">
                            <div class="carousel-item active">
                                <img src="밤하늘.jfif" class="d-block w-100" alt="...">
                                <div class="carousel-caption d-none d-md-block">
    
                                    <h5>First</h5>
                                    <p>Some representative placeholder content for the first slide.</p>
                                </div>
                            </div>
                            <div class="carousel-item">
                                <img src="오로라.jfif" class="d-block w-100" alt="...">
                                <div class="carousel-caption d-none d-md-block">
    
                                    <h5>Second</h5>
                                    <p>Some representative placeholder content for the second slide.</p>
                                </div>
                            </div>
                            <div class="carousel-item">
                                <img src="밤하늘.jfif" class="d-block w-100" alt="...">
                                <div class="carousel-caption d-none d-md-block">
    
                                    <h5>Third</h5>
                                    <p>Some representative placeholder content for the third slide.</p>
                                </div>
                            </div>
                            <div class="carousel-item">
                                <img src="오로라.jfif" class="d-block w-100" alt="...">
                                <div class="carousel-caption d-none d-md-block">                                 
                                    <h5>last</h5>
                                    <p>Some representative placeholder content for the second slide.</p>
                                </div>
                            </div>
                        </div>
                        <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleIndicators"
                            data-bs-slide="prev">
                            <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                            <span class="visually-hidden">Previous</span>
                        </button>
                        <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleIndicators"
                            data-bs-slide="next">
                            <span class="carousel-control-next-icon" aria-hidden="true"></span>
                            <span class="visually-hidden">Next</span>
                        </button>
                    </div>
                </div>    
            </div>
         </div>



           <hr>

        <div class="container">
            <div class="row justify-content-center">
                <div class="col-8">
                    <table class="table">
                        <tread>
                            <tr>
                                <th>one</th>
                                <th>two</th>
                                <th>three</th>
                                <th>four</th>
                            </tr>
                        </tread>
                        <tbody>
                            <tr>
                                <td>
                                    Lorem, ipsum dolor sit amet consectetur adipisicing elit. Tempore odio beatae, molestias voluptatem, eius perferendis itaque quos necessitatibus, facilis alias pariatur animi corrupti excepturi cum? Voluptas consequuntur facilis eius voluptatibus!
                                </td>
                                <td>
                                    Repellat commodi sequi repellendus quo repudiandae dignissimos quam dolores unde vitae non alias rerum saepe nesciunt quis consequuntur, cum molestiae perspiciatis ipsa, odio corrupti delectus eligendi sint odit dolorem? Ex.
                                </td>
                                <td>
                                    Magnam dicta, quos quo eius, praesentium aspernatur tempore illo omnis ex quod officia commodi ullam laborum voluptates consequatur quis. A recusandae assumenda eligendi culpa consequuntur nobis odit maiores accusamus deserunt!
                                </td>
                                <td>
                                    Sint magnam voluptas in eveniet itaque error dolore vel consequatur recusandae voluptates odio expedita consequuntur explicabo labore quis praesentium quia, dolorum sunt iste ad beatae minima quo! Eum, dolorem illum.
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    Lorem ipsum dolor sit amet, consectetur adipisicing elit. Modi molestiae labore, consectetur, doloremque consequatur aperiam veniam a fugit temporibus iusto possimus commodi maiores officia numquam praesentium recusandae cupiditate soluta atque!
                                </td>
                                <td>
                                    Itaque animi quo vel eveniet eos enim ab quibusdam voluptatum vitae, at, recusandae minima, ducimus dicta a sequi quaerat numquam magnam. Aut esse dignissimos doloremque dolor molestias, minus distinctio temporibus!
                                </td>
                                <td>
                                    Cumque tempore deserunt beatae molestiae ipsum nostrum quasi neque, quod, accusantium maiores earum assumenda delectus dolores dicta fuga, sint ad provident quidem voluptatum quisquam saepe nihil dolorum cum sed! Hic.
                                </td>
                                <td>
                                    Eaque perferendis iste dolore in beatae praesentium blanditiis, odit sequi cumque omnis incidunt placeat perspiciatis illo possimus animi. Alias quidem laudantium exercitationem fugit? Voluptatem nobis recusandae tempore voluptates, quam ullam.
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    Lorem ipsum dolor sit amet consectetur, adipisicing elit. Maxime ea dolores sint unde voluptate. Vero doloribus, repellat unde dicta modi ducimus! Labore ipsum corrupti unde deleniti culpa exercitationem quibusdam nisi!
                                </td>
                                <td>
                                    Nesciunt laboriosam sapiente repellendus animi excepturi eligendi sed et, corrupti, laborum harum sit aspernatur minus accusamus, ipsa modi beatae officia? Consectetur maiores sed veniam repellendus laborum reiciendis nobis rerum dicta.
                                </td>
                                <td>
                                    Blanditiis porro, beatae deserunt aliquid aliquam repellat cumque ea minus quidem eligendi, id sunt natus dolore fugit excepturi placeat, quasi molestiae odio quibusdam distinctio eos! Dignissimos veritatis ea deleniti odio?
                                </td>
                                <td>
                                    Iste perspiciatis atque provident, alias aperiam a, facilis consequuntur ab, eveniet temporibus placeat. Impedit voluptatum ea sunt, id veniam ratione assumenda atque dolorum amet voluptate fuga facilis consequuntur iusto voluptatem.
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    Lorem ipsum dolor sit amet consectetur adipisicing elit. Hic maiores exercitationem aut possimus eligendi odit molestias aperiam harum voluptatem, amet, id repellendus maxime, ab nulla molestiae commodi sint dignissimos dolorem?
                                </td>
                                <td>
                                    Impedit ratione expedita, obcaecati doloribus in veritatis necessitatibus quia pariatur assumenda sed provident eos qui eaque minima, sunt odio laborum neque autem. Officia alias odit veritatis labore amet illum harum.
                                </td>
                                <td>
                                    Distinctio a totam similique amet eum asperiores nostrum. Ab, consequatur blanditiis architecto, et dolorum tenetur ipsum ipsa corrupti maxime magni minima. Qui nulla in voluptas laborum mollitia. Illum, molestiae sapiente?
                                </td>
                                <td>
                                    Dolorem qui quia earum iste voluptas, veniam delectus excepturi magni repudiandae asperiores quod. Vero corporis inventore repellat maxime suscipit culpa nemo cupiditate, nostrum, at praesentium, perferendis reiciendis neque perspiciatis nihil?
                                </td>
                            </tr>
                        </tbody>
                    </table>
                </div>
            <div class="col-2"></div>
            <h3 class="col-2">log<hr>
                <ul id="ul1" style="font-size:16px;text-align:left;"></ul>
            </h3>    
        </div>
    </div>
    
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.min.js" integrity="sha384-ODmDIVzN+pFdexxHEHFBQH3/9/vQ9uori45z4JjnFsRydbmQbmL5t1tQ0culUzyK" crossorigin="anonymous"></script>
<script>
    


        let button = document.querySelectorAll("h2");
        for(i=0; i<button.length; i++){
            button[i].addEventListener("click", function(){
                this.nextElementSibling.classList.toggle("d-none");
        })

    }

  
        
        document.querySelector("#btn1").addEventListener("click", function(){
            let text = document.querySelector("#input1").value;
            let ul = document.querySelector("#ul1");
            let li = document.createElement("li");
            ul.append(li);
            li.textContent = text;
            
            let trash = document.createElement("button");
            trash.insertAdjacentHTML("beforeend", '<i class="fa-regular fa-trash-can"></i>');
            li.append(trash);
            trash.addEventListener("click",function(){
                this.parentElement.remove();
            })
        
            
            
            
        })

        let input = document.querySelector('#input1');
            input.addEventListener('keyup',function(e){
             if (e.keyCode === 13) {
                let text = document.querySelector("#input1").value;
                let ul = document.querySelector("#ul1");
                let li = document.createElement("li");
                ul.append(li);
                li.textContent = text;
            
                let trash = document.createElement("button");
                trash.insertAdjacentHTML("beforeend", '<i class="fa-regular fa-trash-can"></i>');
                li.append(trash);
                trash.addEventListener("click",function(){
                    this.parentElement.remove();
                })
        
            
            
            

             
             
            }  
        });

    
        
      
        

    
        

        
	
	
</script>
</body>
</html>