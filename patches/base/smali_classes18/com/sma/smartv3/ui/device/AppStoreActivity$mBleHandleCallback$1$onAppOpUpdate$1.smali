.class final Lcom/sma/smartv3/ui/device/AppStoreActivity$mBleHandleCallback$1$onAppOpUpdate$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/AppStoreActivity$mBleHandleCallback$1;->onAppOpUpdate(Lcom/szabh/smable3/entity/BleAppOp;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lcom/android/mltcode/paycertificationapi/i00OIXiO;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.sma.smartv3.ui.device.AppStoreActivity$mBleHandleCallback$1$onAppOpUpdate$1"
    f = "AppStoreActivity.kt"
    i = {
        0x0
    }
    l = {
        0x6b
    }
    m = "invokeSuspend"
    n = {
        "message"
    }
    s = {
        "L$0"
    }
    v = 0x1
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/sma/smartv3/ui/device/AppStoreActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/AppStoreActivity;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/ui/device/AppStoreActivity;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/sma/smartv3/ui/device/AppStoreActivity$mBleHandleCallback$1$onAppOpUpdate$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/AppStoreActivity$mBleHandleCallback$1$onAppOpUpdate$1;->this$0:Lcom/sma/smartv3/ui/device/AppStoreActivity;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method

.method public static synthetic O00()Z
    .locals 1

    invoke-static {}, Lcom/sma/smartv3/ui/device/AppStoreActivity$mBleHandleCallback$1$onAppOpUpdate$1;->invokeSuspend$lambda$0$0()Z

    move-result v0

    return v0
.end method

.method private static final invokeSuspend$lambda$0$0()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/coroutines/Continuation<",
            "*>;)",
            "Lkotlin/coroutines/Continuation<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance p1, Lcom/sma/smartv3/ui/device/AppStoreActivity$mBleHandleCallback$1$onAppOpUpdate$1;

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/AppStoreActivity$mBleHandleCallback$1$onAppOpUpdate$1;->this$0:Lcom/sma/smartv3/ui/device/AppStoreActivity;

    invoke-direct {p1, v0, p2}, Lcom/sma/smartv3/ui/device/AppStoreActivity$mBleHandleCallback$1$onAppOpUpdate$1;-><init>(Lcom/sma/smartv3/ui/device/AppStoreActivity;Lkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public final invoke(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/mltcode/paycertificationapi/i00OIXiO;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/device/AppStoreActivity$mBleHandleCallback$1$onAppOpUpdate$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/ui/device/AppStoreActivity$mBleHandleCallback$1$onAppOpUpdate$1;

    sget-object p2, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/ui/device/AppStoreActivity$mBleHandleCallback$1$onAppOpUpdate$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/device/AppStoreActivity$mBleHandleCallback$1$onAppOpUpdate$1;->invoke(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/sma/smartv3/ui/device/AppStoreActivity$mBleHandleCallback$1$onAppOpUpdate$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/AppStoreActivity$mBleHandleCallback$1$onAppOpUpdate$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/android/mltcode/paycertificationapi/go0;

    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    new-instance p1, Lcom/android/mltcode/paycertificationapi/go0;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/AppStoreActivity$mBleHandleCallback$1$onAppOpUpdate$1;->this$0:Lcom/sma/smartv3/ui/device/AppStoreActivity;

    invoke-static {v1}, Lcom/sma/smartv3/ui/device/AppStoreActivity;->access$getMContext(Lcom/sma/smartv3/ui/device/AppStoreActivity;)Landroid/app/Activity;

    move-result-object v1

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-direct {p1, v1, v3, v4, v5}, Lcom/android/mltcode/paycertificationapi/go0;-><init>(Landroid/app/Activity;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v1, 0x7f141348

    invoke-virtual {p1, v1}, Lcom/android/mltcode/paycertificationapi/go0;->O1O(I)V

    const v1, 0x7f140145

    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/Boxing;->IiI10X(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/android/mltcode/paycertificationapi/go0;->iX(Ljava/lang/Integer;)V

    new-instance v1, Lcom/sma/smartv3/ui/device/OXO1;

    invoke-direct {v1}, Lcom/sma/smartv3/ui/device/OXO1;-><init>()V

    const v3, 0x7f1412e2

    invoke-virtual {p1, v3, v1}, Lcom/android/mltcode/paycertificationapi/go0;->X1IX(ILkotlin/jvm/functions/Function0;)V

    invoke-static {p1, v5, v5, v4, v5}, Lcom/android/mltcode/paycertificationapi/go0;->X11iII1O1(Lcom/android/mltcode/paycertificationapi/go0;Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/AppStoreActivity$mBleHandleCallback$1$onAppOpUpdate$1;->this$0:Lcom/sma/smartv3/ui/device/AppStoreActivity;

    const v3, 0x7f0a09af

    invoke-virtual {v1, v3}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    const-string v3, "findViewById(...)"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v1}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->XiOIO(Landroid/view/View;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/AppStoreActivity$mBleHandleCallback$1$onAppOpUpdate$1;->L$0:Ljava/lang/Object;

    iput v2, p0, Lcom/sma/smartv3/ui/device/AppStoreActivity$mBleHandleCallback$1$onAppOpUpdate$1;->label:I

    const-wide/16 v1, 0x1388

    invoke-static {v1, v2, p0}, Lkotlinx/coroutines/DelayKt;->XIi00iiXO(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_2

    return-object v0

    :cond_2
    move-object v0, p1

    :goto_0
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_3
    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p1
.end method
