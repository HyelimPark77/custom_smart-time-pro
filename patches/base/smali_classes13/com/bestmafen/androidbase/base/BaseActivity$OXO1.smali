.class public final Lcom/bestmafen/androidbase/base/BaseActivity$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bestmafen/androidbase/base/BaseActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "OXO1"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/bestmafen/androidbase/base/BaseActivity$OXO1;-><init>()V

    return-void
.end method


# virtual methods
.method public final OXO1()I
    .locals 1

    invoke-static {}, Lcom/bestmafen/androidbase/base/BaseActivity;->access$getDEFAULT_NAV_BAR_COLOR$cp()I

    move-result v0

    return v0
.end method

.method public final XIi00iiXO()I
    .locals 1

    invoke-static {}, Lcom/bestmafen/androidbase/base/BaseActivity;->access$getDEFAULT_TOP_BAR_COLOR$cp()I

    move-result v0

    return v0
.end method

.method public final XO0O10(I)V
    .locals 0

    invoke-static {p1}, Lcom/bestmafen/androidbase/base/BaseActivity;->access$setDEFAULT_TOP_BAR_COLOR$cp(I)V

    return-void
.end method

.method public final iO(I)V
    .locals 0

    invoke-static {p1}, Lcom/bestmafen/androidbase/base/BaseActivity;->access$setDEFAULT_NAV_BAR_COLOR$cp(I)V

    return-void
.end method
