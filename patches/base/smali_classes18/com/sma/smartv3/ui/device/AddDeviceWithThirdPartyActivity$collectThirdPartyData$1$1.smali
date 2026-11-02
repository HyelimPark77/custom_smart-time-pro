.class final Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity$collectThirdPartyData$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity$collectThirdPartyData$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "com.sma.smartv3.ui.device.AddDeviceWithThirdPartyActivity$collectThirdPartyData$1$1"
    f = "AddDeviceWithThirdPartyActivity.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
    v = 0x1
.end annotation


# instance fields
.field final synthetic $device:Lcom/bestmafen/baseble/scanner/BleDevice;

.field label:I

.field final synthetic this$0:Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;Lcom/bestmafen/baseble/scanner/BleDevice;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;",
            "Lcom/bestmafen/baseble/scanner/BleDevice;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity$collectThirdPartyData$1$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity$collectThirdPartyData$1$1;->this$0:Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;

    iput-object p2, p0, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity$collectThirdPartyData$1$1;->$device:Lcom/bestmafen/baseble/scanner/BleDevice;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2
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

    new-instance p1, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity$collectThirdPartyData$1$1;

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity$collectThirdPartyData$1$1;->this$0:Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity$collectThirdPartyData$1$1;->$device:Lcom/bestmafen/baseble/scanner/BleDevice;

    invoke-direct {p1, v0, v1, p2}, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity$collectThirdPartyData$1$1;-><init>(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;Lcom/bestmafen/baseble/scanner/BleDevice;Lkotlin/coroutines/Continuation;)V

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
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity$collectThirdPartyData$1$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity$collectThirdPartyData$1$1;

    sget-object p2, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity$collectThirdPartyData$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity$collectThirdPartyData$1$1;->invoke(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    iget v0, p0, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity$collectThirdPartyData$1$1;->label:I

    if-nez v0, :cond_3

    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity$collectThirdPartyData$1$1;->this$0:Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->access$getViewModel$p(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;)Lcom/sma/smartv3/ui/device/model/AddDeviceViewModel;

    move-result-object p1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity$collectThirdPartyData$1$1;->$device:Lcom/bestmafen/baseble/scanner/BleDevice;

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/ui/device/model/AddDeviceViewModel;->isSupportedThirdPartyDevice(Lcom/bestmafen/baseble/scanner/BleDevice;)Z

    move-result p1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity$collectThirdPartyData$1$1;->this$0:Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->access$getMCacheSortByList$p(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity$collectThirdPartyData$1$1;->$device:Lcom/bestmafen/baseble/scanner/BleDevice;

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz p1, :cond_1

    if-nez v0, :cond_1

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity$collectThirdPartyData$1$1;->this$0:Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;

    invoke-static {v2}, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->access$getMCacheSortByList$p(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;)Ljava/util/List;

    move-result-object v2

    iget-object v3, p0, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity$collectThirdPartyData$1$1;->$device:Lcom/bestmafen/baseble/scanner/BleDevice;

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity$collectThirdPartyData$1$1;->this$0:Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;

    invoke-static {v2}, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->access$getMList(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->clear()V

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity$collectThirdPartyData$1$1;->this$0:Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;

    invoke-static {v2}, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->access$getMList(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;)Ljava/util/List;

    move-result-object v2

    iget-object v3, p0, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity$collectThirdPartyData$1$1;->this$0:Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;

    invoke-static {v3}, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->access$getMCacheSortByList$p(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;)Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v2, v3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity$collectThirdPartyData$1$1;->this$0:Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;

    invoke-static {v2}, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->access$getMCacheSortByList$p(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_0

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity$collectThirdPartyData$1$1;->this$0:Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;

    invoke-static {v2}, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->access$getEmpty(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v2

    const/16 v3, 0x8

    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity$collectThirdPartyData$1$1;->this$0:Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;

    invoke-static {v2}, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->access$getMListView(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;)Landroid/widget/ListView;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity$collectThirdPartyData$1$1;->this$0:Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;

    invoke-static {v2}, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->access$getMListAdapter(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;)Lcom/android/mltcode/paycertificationapi/XII0Oi10O;

    move-result-object v2

    invoke-virtual {v2}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity$collectThirdPartyData$1$1;->this$0:Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;

    invoke-static {v2}, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->access$getMListView(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;)Landroid/widget/ListView;

    move-result-object v2

    invoke-virtual {v2}, Landroid/widget/AbsListView;->invalidateViews()V

    :cond_0
    sget-object v2, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v3, p0, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity$collectThirdPartyData$1$1;->this$0:Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;

    invoke-static {v3}, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->access$getMListView(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;)Landroid/widget/ListView;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v3

    iget-object v4, p0, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity$collectThirdPartyData$1$1;->this$0:Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;

    invoke-static {v4}, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->access$getMListView(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;)Landroid/widget/ListView;

    move-result-object v4

    invoke-virtual {v4}, Landroid/view/View;->getVisibility()I

    move-result v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "ListView attachedToWindow: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v3, ", visible: "

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    :cond_1
    sget-object v2, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    if-eqz p1, :cond_2

    if-nez v0, :cond_2

    const/4 v1, 0x1

    :cond_2
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity$collectThirdPartyData$1$1;->$device:Lcom/bestmafen/baseble/scanner/BleDevice;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "AddDeviceWithThirdParty collectThirdPartyData Supported:"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, "  "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
