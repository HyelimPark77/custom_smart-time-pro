.class public final Lcom/sma/smartv3/ui/device/item/NavigationItem;
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
    .locals 3

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->i0()Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    const-string v0, "built-in.navigation"

    invoke-static {v0}, Lcom/sma/smartv3/model/FileTransmissionKt;->appStoreIsShowCurrentCategory(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->iXi1()Z

    :goto_0
    invoke-virtual {p0, v2}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemHidden(Z)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d02ab

    return v0
.end method
