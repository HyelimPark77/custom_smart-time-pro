.class public final Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel$uploadDeviceInfoToHyky$2$1$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/O1XIiIO;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel$uploadDeviceInfoToHyky$2$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/android/mltcode/paycertificationapi/O1XIiIO<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel$uploadDeviceInfoToHyky$2$1$1$1;->this$0:Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public handleError(Ljava/lang/String;)V
    .locals 3

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel$uploadDeviceInfoToHyky$2$1$1$1;->this$0:Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel;

    invoke-static {v1}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel;->access$getTAG$p(Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " uploadDeviceInfoToHyky handleResponse: error = "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic handleResponse(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel$uploadDeviceInfoToHyky$2$1$1$1;->handleResponse(Ljava/lang/String;)V

    return-void
.end method

.method public handleResponse(Ljava/lang/String;)V
    .locals 2

    .line 2
    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v0, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel$uploadDeviceInfoToHyky$2$1$1$1;->this$0:Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel;

    invoke-static {v0}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel;->access$getTAG$p(Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " uploadDeviceInfoToHyky handleResponse: success!"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    return-void
.end method
