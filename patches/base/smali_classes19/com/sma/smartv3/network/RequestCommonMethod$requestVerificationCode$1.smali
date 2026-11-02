.class public final Lcom/sma/smartv3/network/RequestCommonMethod$requestVerificationCode$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/O1XIiIO;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/network/RequestCommonMethod;->requestVerificationCode(Landroid/app/Activity;Landroid/view/View;Ljava/lang/String;Landroid/widget/TextView;ILcom/android/mltcode/paycertificationapi/O1XIiIO;)V
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
.field final synthetic $callback:Lcom/android/mltcode/paycertificationapi/O1XIiIO;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/android/mltcode/paycertificationapi/O1XIiIO<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $context:Landroid/app/Activity;

.field final synthetic $showCountDownTimeView:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Landroid/widget/TextView;Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Landroid/widget/TextView;",
            "Lcom/android/mltcode/paycertificationapi/O1XIiIO<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/network/RequestCommonMethod$requestVerificationCode$1;->$context:Landroid/app/Activity;

    iput-object p2, p0, Lcom/sma/smartv3/network/RequestCommonMethod$requestVerificationCode$1;->$showCountDownTimeView:Landroid/widget/TextView;

    iput-object p3, p0, Lcom/sma/smartv3/network/RequestCommonMethod$requestVerificationCode$1;->$callback:Lcom/android/mltcode/paycertificationapi/O1XIiIO;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public handleError(Ljava/lang/String;)V
    .locals 1

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/network/RequestCommonMethod$requestVerificationCode$1;->$callback:Lcom/android/mltcode/paycertificationapi/O1XIiIO;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/android/mltcode/paycertificationapi/O1XIiIO;->handleError(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic handleResponse(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/network/RequestCommonMethod$requestVerificationCode$1;->handleResponse(Ljava/lang/String;)V

    return-void
.end method

.method public handleResponse(Ljava/lang/String;)V
    .locals 7

    const v0, 0x7f14030d

    .line 2
    invoke-static {v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    .line 3
    iget-object v1, p0, Lcom/sma/smartv3/network/RequestCommonMethod$requestVerificationCode$1;->$context:Landroid/app/Activity;

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/i72;->X01IiOiIi()J

    move-result-wide v2

    const-wide/16 v4, 0x3e8

    iget-object v6, p0, Lcom/sma/smartv3/network/RequestCommonMethod$requestVerificationCode$1;->$showCountDownTimeView:Landroid/widget/TextView;

    invoke-static/range {v1 .. v6}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->X100O(Landroid/content/Context;JJLandroid/widget/TextView;)V

    .line 4
    iget-object v0, p0, Lcom/sma/smartv3/network/RequestCommonMethod$requestVerificationCode$1;->$callback:Lcom/android/mltcode/paycertificationapi/O1XIiIO;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/android/mltcode/paycertificationapi/O1XIiIO;->handleResponse(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method
