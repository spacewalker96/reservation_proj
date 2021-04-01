<!DOCTYPE html>
<html lang="en">

<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->

	<title>Booking Form HTML Template</title>

	<!-- Google font -->
	<link href="https://fonts.googleapis.com/css?family=Poppins:400" rel="stylesheet">

	<!-- Bootstrap -->
	<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/reservation_temp/css/bootstrap.min.css" />

	<!-- Custom stlylesheet -->
	<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/reservation_temp/css/style.css" />

</head>

<body>
	<div id="booking" class="section">
		<div class="section-center">
			<div class="container">
				<div class="row">
					<div class="booking-form">
						<form  method="post" action="${pageContext.request.contextPath}/saveReservation">
							
									<div class="container">
				<div class="row">
					<div class="booking-form">
						<form>
						
								<div class="col-md-8">
									
										<div class="col-md-5">
											<div class="form-group">
												<span class="form-label">Reservation date</span>
												<input class="form-control" type="Date" name="date">
											</div>
										</div>
										<div class="col-md-5">
											<div class="form-group">
												<span class="form-label" >Reservation Type</span>
												<select class="form-control" name="typeReservation" >
												 <option value ="weekend">weekend</option>
            									<option value ="matin">matin</option>
           										 <option value ="soir">soir</option>
												</select>
												<span class="select-arrow"></span>
											</div>
										</div>
									</div>
								</div>
							
	
								<div class="col-md-3 float-right">
									<div class="form-btn">
										<button class="submit-btn" type="submit">Reserver</button>
									</div>
								</div>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</body><!-- This templates was made by Colorlib (https://colorlib.com) -->

</html>