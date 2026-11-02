.class public Lcom/sma/smartv3/ui/device/item/DeviceListItem;
.super Lcom/bestmafen/androidbase/dsl/BaseDslItem;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDeviceListItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceListItem.kt\ncom/sma/smartv3/ui/device/item/DeviceListItem\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,57:1\n1#2:58\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nDeviceListItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceListItem.kt\ncom/sma/smartv3/ui/device/item/DeviceListItem\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,57:1\n1#2:58\n*E\n"
    }
.end annotation


# instance fields
.field private context:Landroid/content/Context;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private dslAdapter:Lcom/angcyo/dsladapter/DslAdapter;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field public items:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/angcyo/dsladapter/DslAdapterItem;",
            ">;"
        }
    .end annotation
.end field

.field private mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mTitle:I


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/bestmafen/androidbase/dsl/BaseDslItem;-><init>()V

    return-void
.end method


# virtual methods
.method public bindView(Lcom/angcyo/dsladapter/DslViewHolder;)V
    .locals 4
    .param p1    # Lcom/angcyo/dsladapter/DslViewHolder;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "itemHolder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/angcyo/dsladapter/DslViewHolder;->getContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/item/DeviceListItem;->context:Landroid/content/Context;

    const v0, 0x7f0a1897

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->tv(I)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget v2, p0, Lcom/sma/smartv3/ui/device/item/DeviceListItem;->mTitle:I

    if-eqz v2, :cond_0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget v2, p0, Lcom/sma/smartv3/ui/device/item/DeviceListItem;->mTitle:I

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0

    :cond_0
    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    :cond_1
    :goto_0
    const v0, 0x7f0a0996

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->rv(I)Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/item/DeviceListItem;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz p1, :cond_2

    const/16 v0, 0x64

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setItemViewCacheSize(I)V

    :cond_2
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/item/DeviceListItem;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz p1, :cond_3

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setItemAnimator(Landroidx/recyclerview/widget/RecyclerView$ItemAnimator;)V

    :cond_3
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/item/DeviceListItem;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    const/4 v0, 0x1

    if-eqz p1, :cond_4

    new-instance v2, Landroidx/recyclerview/widget/LinearLayoutManager;

    iget-object v3, p0, Lcom/sma/smartv3/ui/device/item/DeviceListItem;->context:Landroid/content/Context;

    invoke-direct {v2, v3, v0, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;IZ)V

    invoke-virtual {p1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    :cond_4
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/item/DeviceListItem;->getItems()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_5
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/angcyo/dsladapter/DslAdapterItem;

    instance-of v3, v2, Lcom/bestmafen/androidbase/dsl/BaseDslItem;

    if-eqz v3, :cond_5

    move-object v3, v2

    check-cast v3, Lcom/bestmafen/androidbase/dsl/BaseDslItem;

    invoke-virtual {v3}, Lcom/bestmafen/androidbase/dsl/BaseDslItem;->initView()V

    invoke-virtual {v2}, Lcom/angcyo/dsladapter/DslAdapterItem;->getItemHidden()Z

    move-result v2

    if-nez v2, :cond_5

    move v0, v1

    goto :goto_1

    :cond_6
    new-instance p1, Lcom/angcyo/dsladapter/DslAdapter;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/item/DeviceListItem;->getItems()Ljava/util/List;

    move-result-object v1

    invoke-direct {p1, v1}, Lcom/angcyo/dsladapter/DslAdapter;-><init>(Ljava/util/List;)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/item/DeviceListItem;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v1, :cond_7

    invoke-virtual {v1, p1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    :cond_7
    iput-object p1, p0, Lcom/sma/smartv3/ui/device/item/DeviceListItem;->dslAdapter:Lcom/angcyo/dsladapter/DslAdapter;

    invoke-virtual {p0, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemHidden(Z)V

    return-void
.end method

.method public final getItems()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/angcyo/dsladapter/DslAdapterItem;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/item/DeviceListItem;->items:Ljava/util/List;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "items"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getMTitle()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/device/item/DeviceListItem;->mTitle:I

    return v0
.end method

.method public initView()V
    .locals 0

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d02d8

    return v0
.end method

.method public final setItems(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/angcyo/dsladapter/DslAdapterItem;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/item/DeviceListItem;->items:Ljava/util/List;

    return-void
.end method

.method public final setMTitle(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/device/item/DeviceListItem;->mTitle:I

    return-void
.end method
