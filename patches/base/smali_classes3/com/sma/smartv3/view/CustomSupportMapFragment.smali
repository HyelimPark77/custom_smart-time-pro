.class public final Lcom/sma/smartv3/view/CustomSupportMapFragment;
.super Lcom/google/android/gms/maps/SupportMapFragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/view/CustomSupportMapFragment$OXO1;,
        Lcom/sma/smartv3/view/CustomSupportMapFragment$TouchableWrapper;
    }
.end annotation


# instance fields
.field private mListener:Lcom/sma/smartv3/view/CustomSupportMapFragment$OXO1;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/maps/SupportMapFragment;-><init>()V

    return-void
.end method

.method public static final synthetic access$getMListener$p(Lcom/sma/smartv3/view/CustomSupportMapFragment;)Lcom/sma/smartv3/view/CustomSupportMapFragment$OXO1;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/view/CustomSupportMapFragment;->mListener:Lcom/sma/smartv3/view/CustomSupportMapFragment$OXO1;

    return-object p0
.end method


# virtual methods
.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2
    .param p1    # Landroid/view/LayoutInflater;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Landroid/view/ViewGroup;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p3    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "inflater"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2, p3}, Lcom/google/android/gms/maps/SupportMapFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object p1

    const-string p2, "onCreateView(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Lcom/sma/smartv3/view/CustomSupportMapFragment$TouchableWrapper;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p3

    invoke-direct {p2, p0, p3}, Lcom/sma/smartv3/view/CustomSupportMapFragment$TouchableWrapper;-><init>(Lcom/sma/smartv3/view/CustomSupportMapFragment;Landroid/content/Context;)V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    const v0, 0x7f060760

    invoke-virtual {p3, v0}, Landroid/content/res/Resources;->getColor(I)I

    move-result p3

    invoke-virtual {p2, p3}, Landroid/view/View;->setBackgroundColor(I)V

    move-object p3, p1

    check-cast p3, Landroid/view/ViewGroup;

    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    const/4 v1, -0x1

    invoke-direct {v0, v1, v1}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {p3, p2, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-object p1
.end method

.method public final setListener(Lcom/sma/smartv3/view/CustomSupportMapFragment$OXO1;)V
    .locals 0
    .param p1    # Lcom/sma/smartv3/view/CustomSupportMapFragment$OXO1;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/view/CustomSupportMapFragment;->mListener:Lcom/sma/smartv3/view/CustomSupportMapFragment$OXO1;

    return-void
.end method
