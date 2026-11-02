.class public final Lcom/sma/smartv3/ui/me/DeveloperShowRealtimeLogActivity;
.super Lcom/bestmafen/androidbase/list/BaseListActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/bestmafen/androidbase/list/BaseListActivity<",
        "Lcom/szabh/smable3/entity/BleRealtimeLog;",
        ">;"
    }
.end annotation


# instance fields
.field private final dataList:Ljava/util/ArrayList;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/szabh/smable3/entity/BleRealtimeLog;",
            ">;"
        }
    .end annotation
.end field

.field private final mBleHandleCallback:Lcom/sma/smartv3/ui/me/DeveloperShowRealtimeLogActivity$OXO1;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperShowRealtimeLogActivity;->dataList:Ljava/util/ArrayList;

    new-instance v0, Lcom/sma/smartv3/ui/me/DeveloperShowRealtimeLogActivity$OXO1;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/me/DeveloperShowRealtimeLogActivity$OXO1;-><init>(Lcom/sma/smartv3/ui/me/DeveloperShowRealtimeLogActivity;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperShowRealtimeLogActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/me/DeveloperShowRealtimeLogActivity$OXO1;

    return-void
.end method

.method public static final synthetic access$getDataList$p(Lcom/sma/smartv3/ui/me/DeveloperShowRealtimeLogActivity;)Ljava/util/ArrayList;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/me/DeveloperShowRealtimeLogActivity;->dataList:Ljava/util/ArrayList;

    return-object p0
.end method

.method public static final synthetic access$getMListAdapter(Lcom/sma/smartv3/ui/me/DeveloperShowRealtimeLogActivity;)Lcom/android/mltcode/paycertificationapi/XII0Oi10O;
    .locals 0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMListAdapter()Lcom/android/mltcode/paycertificationapi/XII0Oi10O;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final clearData(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperShowRealtimeLogActivity;->dataList:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMListAdapter()Lcom/android/mltcode/paycertificationapi/XII0Oi10O;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/Object;

    const-string v0, "Clear Show"

    invoke-static {v0, p1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public init(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    sget-object p1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperShowRealtimeLogActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/me/DeveloperShowRealtimeLogActivity$OXO1;

    invoke-virtual {p1, v0}, Lcom/szabh/smable3/component/BleConnector;->addHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    return-void
.end method

.method public initItem(Lcom/android/mltcode/paycertificationapi/ug6;Lcom/szabh/smable3/entity/BleRealtimeLog;I)V
    .locals 0
    .param p1    # Lcom/android/mltcode/paycertificationapi/ug6;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Lcom/szabh/smable3/entity/BleRealtimeLog;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string p3, "holder"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "item"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const p3, 0x1020014

    .line 2
    invoke-virtual {p2}, Lcom/szabh/smable3/entity/BleRealtimeLog;->getMContent()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p3, p2}, Lcom/android/mltcode/paycertificationapi/ug6;->OII(ILjava/lang/String;)Lcom/android/mltcode/paycertificationapi/ug6;

    return-void
.end method

.method public bridge synthetic initItem(Lcom/android/mltcode/paycertificationapi/ug6;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    check-cast p2, Lcom/szabh/smable3/entity/BleRealtimeLog;

    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/me/DeveloperShowRealtimeLogActivity;->initItem(Lcom/android/mltcode/paycertificationapi/ug6;Lcom/szabh/smable3/entity/BleRealtimeLog;I)V

    return-void
.end method

.method public initList()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleRealtimeLog;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperShowRealtimeLogActivity;->dataList:Ljava/util/ArrayList;

    return-object v0
.end method

.method public itemLayoutId()I
    .locals 1

    const v0, 0x1090003

    return v0
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0063

    return v0
.end method

.method public onDestroy()V
    .locals 2

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperShowRealtimeLogActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/me/DeveloperShowRealtimeLogActivity$OXO1;

    invoke-virtual {v0, v1}, Lcom/szabh/smable3/component/BleConnector;->removeHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    invoke-super {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->onDestroy()V

    return-void
.end method
