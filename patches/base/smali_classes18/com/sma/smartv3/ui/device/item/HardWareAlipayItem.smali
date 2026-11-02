.class public final Lcom/sma/smartv3/ui/device/item/HardWareAlipayItem;
.super Lcom/bestmafen/androidbase/dsl/BaseDslItem;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/bestmafen/androidbase/dsl/BaseDslItem;-><init>()V

    return-void
.end method


# virtual methods
.method public bindView(Lcom/angcyo/dsladapter/DslViewHolder;)V
    .locals 1
    .param p1    # Lcom/angcyo/dsladapter/DslViewHolder;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "itemHolder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public initView()V
    .locals 4

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->i0()Z

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_0

    const-string v0, "built-in.alipay"

    invoke-static {v0}, Lcom/sma/smartv3/model/FileTransmissionKt;->appStoreIsShowCurrentCategory(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    :goto_0
    move v2, v3

    goto :goto_1

    :cond_0
    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->Xii1O1Iii()Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    :goto_1
    invoke-virtual {p0, v2}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemHidden(Z)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0296

    return v0
.end method
