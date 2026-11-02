.class public abstract Lcom/sma/smartv3/ui/device/watchface/fragment/BaseElementFragment;
.super Lcom/bestmafen/androidbase/base/BaseFragment;
.source "SourceFile"


# instance fields
.field private mOnViewClickListener:Landroid/view/View$OnClickListener;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;-><init>()V

    return-void
.end method


# virtual methods
.method public final getMOnViewClickListener()Landroid/view/View$OnClickListener;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/watchface/fragment/BaseElementFragment;->mOnViewClickListener:Landroid/view/View$OnClickListener;

    return-object v0
.end method

.method public abstract reset()V
.end method

.method public final setMOnViewClickListener(Landroid/view/View$OnClickListener;)V
    .locals 0
    .param p1    # Landroid/view/View$OnClickListener;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/watchface/fragment/BaseElementFragment;->mOnViewClickListener:Landroid/view/View$OnClickListener;

    return-void
.end method

.method public final setOnViewClickListener(Landroid/view/View$OnClickListener;)V
    .locals 1
    .param p1    # Landroid/view/View$OnClickListener;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/watchface/fragment/BaseElementFragment;->mOnViewClickListener:Landroid/view/View$OnClickListener;

    return-void
.end method
