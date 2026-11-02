.class public final Lcom/sma/smartv3/model/BDUpLoadLocationResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private fail_info:Ljava/lang/Object;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private message:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private status:I

.field private success_num:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lcom/sma/smartv3/model/BDUpLoadLocationResponse;->message:Ljava/lang/String;

    new-instance v0, Lcom/sma/smartv3/model/BDUpLoadLocationResponse$fail_info$1;

    invoke-direct {v0}, Lcom/sma/smartv3/model/BDUpLoadLocationResponse$fail_info$1;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/model/BDUpLoadLocationResponse;->fail_info:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final getFail_info()Ljava/lang/Object;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/BDUpLoadLocationResponse;->fail_info:Ljava/lang/Object;

    return-object v0
.end method

.method public final getMessage()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/BDUpLoadLocationResponse;->message:Ljava/lang/String;

    return-object v0
.end method

.method public final getStatus()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/BDUpLoadLocationResponse;->status:I

    return v0
.end method

.method public final getSuccess_num()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/BDUpLoadLocationResponse;->success_num:I

    return v0
.end method

.method public final setFail_info(Ljava/lang/Object;)V
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/model/BDUpLoadLocationResponse;->fail_info:Ljava/lang/Object;

    return-void
.end method

.method public final setMessage(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/model/BDUpLoadLocationResponse;->message:Ljava/lang/String;

    return-void
.end method

.method public final setStatus(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/BDUpLoadLocationResponse;->status:I

    return-void
.end method

.method public final setSuccess_num(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/BDUpLoadLocationResponse;->success_num:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 6
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget v0, p0, Lcom/sma/smartv3/model/BDUpLoadLocationResponse;->status:I

    iget-object v1, p0, Lcom/sma/smartv3/model/BDUpLoadLocationResponse;->message:Ljava/lang/String;

    iget v2, p0, Lcom/sma/smartv3/model/BDUpLoadLocationResponse;->success_num:I

    iget-object v3, p0, Lcom/sma/smartv3/model/BDUpLoadLocationResponse;->fail_info:Ljava/lang/Object;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "BDUpLoadLocationResponse(status="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", message=\'"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\', success_num="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", fail_info="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
