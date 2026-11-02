.class public final Lcom/bestmafen/androidbase/list/BaseListFragment$OXO1;
.super Lcom/android/mltcode/paycertificationapi/XII0Oi10O;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bestmafen/androidbase/list/BaseListFragment;->initView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/android/mltcode/paycertificationapi/XII0Oi10O<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final synthetic X11iII1O1:Lcom/bestmafen/androidbase/list/BaseListFragment;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bestmafen/androidbase/list/BaseListFragment<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/bestmafen/androidbase/list/BaseListFragment;Landroid/app/Activity;ILjava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bestmafen/androidbase/list/BaseListFragment<",
            "TT;>;",
            "Landroid/app/Activity;",
            "I",
            "Ljava/util/List<",
            "TT;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/bestmafen/androidbase/list/BaseListFragment$OXO1;->X11iII1O1:Lcom/bestmafen/androidbase/list/BaseListFragment;

    invoke-direct {p0, p2, p3, p4}, Lcom/android/mltcode/paycertificationapi/XII0Oi10O;-><init>(Landroid/content/Context;ILjava/util/List;)V

    return-void
.end method


# virtual methods
.method public XIi00iiXO(Lcom/android/mltcode/paycertificationapi/ug6;Ljava/lang/Object;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/mltcode/paycertificationapi/ug6;",
            "TT;I)V"
        }
    .end annotation

    const-string v0, "viewHolder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/bestmafen/androidbase/list/BaseListFragment$OXO1;->X11iII1O1:Lcom/bestmafen/androidbase/list/BaseListFragment;

    invoke-interface {v0, p1, p2, p3}, Lcom/android/mltcode/paycertificationapi/np;->initItem(Lcom/android/mltcode/paycertificationapi/ug6;Ljava/lang/Object;I)V

    return-void
.end method

.method public getCount()I
    .locals 1

    iget-object v0, p0, Lcom/bestmafen/androidbase/list/BaseListFragment$OXO1;->X11iII1O1:Lcom/bestmafen/androidbase/list/BaseListFragment;

    invoke-virtual {v0}, Lcom/bestmafen/androidbase/list/BaseListFragment;->getItemCount()I

    move-result v0

    return v0
.end method
